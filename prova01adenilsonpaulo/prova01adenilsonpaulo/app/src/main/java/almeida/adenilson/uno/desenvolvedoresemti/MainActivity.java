package almeida.adenilson.uno.desenvolvedoresemti;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvPergunta, tvResposta;
    private EditText edtQuestao;
    private ImageButton imgLimpar, imgConfirmar;
    private static int questao2 = 2;
    private static int questao3 = 3;
    private static int questao4 = 4;
    private static int questao5 = 5;
    private static int questao6 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPergunta   = findViewById(R.id.tvPergunta);
        tvResposta   = findViewById(R.id.tvResposta);
        edtQuestao   = findViewById(R.id.edtQuestao);
        imgLimpar    = findViewById(R.id.imgLimpar);
        imgConfirmar = findViewById(R.id.imgConfirmar);

        PerguntasRespostas perguntasRespostas = new PerguntasRespostas();

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Desenvolvedores em TI");
        }

        imgLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPergunta.setText("");
                tvResposta.setText("");
                edtQuestao.setText("");
            }
        });

        imgConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!edtQuestao.getText().toString().isEmpty()){
                    if (Integer.valueOf(edtQuestao.getText().toString()) >= questao2 &&
                            Integer.valueOf(edtQuestao.getText().toString()) <= questao6){

                        int numeroQuestao = Integer.valueOf(edtQuestao.getText().toString());

                        if(numeroQuestao == questao2){
                            tvPergunta.setText(perguntasRespostas.pergunta2());
                            tvResposta.setText(perguntasRespostas.resposta2());
                        }

                        if(numeroQuestao == questao3){
                            tvPergunta.setText(perguntasRespostas.pergunta3());
                            tvResposta.setText(perguntasRespostas.resposta3());
                        }

                        if(numeroQuestao == questao4){
                            tvPergunta.setText(perguntasRespostas.pergunta4());
                            tvResposta.setText(perguntasRespostas.resposta4());
                        }

                        if(numeroQuestao == questao5){
                            tvPergunta.setText(perguntasRespostas.pergunta5());
                            tvResposta.setText(perguntasRespostas.resposta5());
                        }

                        if(numeroQuestao == questao6){
                            tvPergunta.setText(perguntasRespostas.pergunta6());
                            tvResposta.setText(perguntasRespostas.resposta6());
                        }

                    } else {
                        Toast.makeText(MainActivity.this, "Informe um número de 2 a 6!"
                                , Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Informe o número da questão!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}