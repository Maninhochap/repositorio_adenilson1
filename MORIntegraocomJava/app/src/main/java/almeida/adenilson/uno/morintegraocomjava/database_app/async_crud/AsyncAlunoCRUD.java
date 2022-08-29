package almeida.adenilson.uno.morintegraocomjava.database_app.async_crud;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.DatabaseApp;
import almeida.adenilson.uno.morintegraocomjava.database_app.dbcallbacks.IAlunoDbCallback;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;
import almeida.adenilson.uno.morintegraocomjava.utils_app.UtilsApp;

public class AsyncAlunoCRUD extends AsyncTask<Aluno, Integer, List<Aluno>> {
    private static String TAG = "AsyncAlunoCRUD";
    private UtilsApp.DataBaseCrudOperations dbOperations;
    private Context contextActivityOrFragment;
    private List<Aluno> lista = null;

    //Evitar leak de memória
    private WeakReference<IAlunoDbCallback> dbCallBack;

    public AsyncAlunoCRUD(UtilsApp.DataBaseCrudOperations dbOperations
            , Context context
            , IAlunoDbCallback callBack){
        this.dbOperations              = dbOperations;
        this.contextActivityOrFragment = context;
        dbCallBack                     = new WeakReference(callBack);
    }

    public AsyncAlunoCRUD(Context context){
        this.dbOperations              = UtilsApp.DataBaseCrudOperations.CREATE;
        this.contextActivityOrFragment = context;
        dbCallBack                     = null;
    }



    @Override
    protected List<Aluno> doInBackground(Aluno... alunos) {
        try{
            DatabaseApp databaseApp = DatabaseApp.getInstance(contextActivityOrFragment);
            lista                   = null;

            switch (dbOperations){
                case CREATE:{
                    for(Aluno aluno : alunos) {
                        databaseApp.alunoDAO().insertAluno(aluno);
                    }
                    break;
                }
                case READ:{
                    lista = databaseApp.alunoDAO().getAllAlunos();
                    break;
                }
                case UPDATE:{
                    databaseApp.alunoDAO().updateAluno(alunos[0]);
                    break;
                }
                case DELETE:{
                    databaseApp.alunoDAO().deleteAluno(alunos[0]);
                    break;
                }
            }
        } catch (Exception e){
            Log.d(TAG, "doInBackground: FALHA - " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    protected void onPostExecute(List<Aluno> alunos) {
        super.onPostExecute(alunos);

        if(dbOperations == UtilsApp.DataBaseCrudOperations.CREATE
                || dbOperations == UtilsApp.DataBaseCrudOperations.READ) {
            if (dbCallBack != null) {
                IAlunoDbCallback callBack = dbCallBack.get();
                callBack.getAlunoFromDB(alunos);
            }
        }
    }
}
