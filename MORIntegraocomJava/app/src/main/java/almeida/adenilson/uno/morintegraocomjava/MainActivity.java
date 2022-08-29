package almeida.adenilson.uno.morintegraocomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nambimobile.widgets.efab.ExpandableFab;
import com.nambimobile.widgets.efab.FabOption;

import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.async_crud.AsyncAlunoCRUD;
import almeida.adenilson.uno.morintegraocomjava.database_app.dbcallbacks.IAlunoDbCallback;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;
import almeida.adenilson.uno.morintegraocomjava.ui.CadastroAlunoActivity;
import almeida.adenilson.uno.morintegraocomjava.utils_app.UtilsApp;

public class MainActivity extends AppCompatActivity  implements IAlunoDbCallback {
    private Context context;
    private Aluno aluno;
    private ExpandableFab expandableFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aluno = new Aluno();
        aluno.setNome("Adenilson");
        aluno.setCelular("991031625");
        aluno.setEmail("adenilson.dealmeida@gmail.com");
        aluno.setGitgub_usuario("maninhochap");

        expandableFab = findViewById(R.id.expandable_fab);

        FabOption fabOptionAluno = findViewById(R.id.fabOptionAluno);
        fabOptionAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroAlunoActivity.class);
                startActivity(intent);
            }
        });

        FabOption fabOptionProva = findViewById(R.id.fabOptionProva);
        fabOptionProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });

        FabOption fabOptionAlunoProva = findViewById(R.id.fabOptionAlunoProva);
        fabOptionAlunoProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });

        FabOption fabOptionPergunta = findViewById(R.id.fabOptionPergunta);
        fabOptionPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });

        FabOption fabOptionResposta = findViewById(R.id.fabOptionResposta);
        fabOptionResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();

        context = getApplicationContext();

        AsyncAlunoCRUD asyncAlunoCRUD = new AsyncAlunoCRUD(UtilsApp.DataBaseCrudOperations.CREATE
        , context
        , this);
    }

    @Override
    public void getAlunoFromDB(List<Aluno> tblAluno) {

    }
}