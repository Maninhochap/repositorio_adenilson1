package almeida.adenilson.uno.morintegraocomjava.database_app;


import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

import almeida.adenilson.uno.morintegraocomjava.database_app.converter.Converters;
import almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao.ICRUDAlunoDAO;
import almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao.ICRUDAlunoProvaDAO;
import almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao.ICRUDPerguntaDAO;
import almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao.ICRUDProvaDAO;
import almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao.ICRUDRespostaDAO;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.AlunoProva;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Pergunta;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Prova;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Resposta;

@Database(entities = {Aluno.class, Prova.class
        , AlunoProva.class, Pergunta.class
        , Resposta.class}
        , exportSchema = false
        , version = 1)

@TypeConverters({Converters.class})
public abstract class  DatabaseApp extends RoomDatabase {
    private static final String DB_NAME="db_app.db";
    private static volatile DatabaseApp sInstance;
    private static final String TAG = "DatabaseApp";

    //Definição dos atributos de classe das interfaces DAO
        public abstract ICRUDAlunoDAO alunoDAO();
        public abstract ICRUDProvaDAO provaDAO();
        public abstract ICRUDAlunoProvaDAO alunoProvaDAO();
        public abstract ICRUDPerguntaDAO perguntaDAO();
        public abstract ICRUDRespostaDAO respostaDAO();

    public DatabaseApp() {
    }

    public static synchronized DatabaseApp getInstance(Context context){
        if (sInstance == null) {
            sInstance = getConnection(context);
        }
        return sInstance;
    }

    private static DatabaseApp getConnection(Context activityContext){
        DatabaseApp db = Room.databaseBuilder(activityContext, DatabaseApp.class, DB_NAME)
                .addCallback(initDB)
                .build();

        return db;
    }

    static RoomDatabase.Callback initDB = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            Executors.newSingleThreadScheduledExecutor().execute(() ->{
                //Executar metodos e/ou rotinas logo após a criação do banco
                Log.d(TAG, "onCreate: Banco criaod com sucesso! Executar rotinas posteriores.");
            });
        }

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {

        }
    };
}
