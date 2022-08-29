package almeida.adenilson.uno.calcular;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String DIVISAO       = "Dividir";
    private static final String MULTIPLICACAO = "Multiplicar";
    private static final String SOMA          = "Somar";
    private static final String SUBTRACAO     = "Subtrair";
    private static final String RAIZQUADRADA  = "Raiz Quadrada";
    private static final String POTENCIACAO   = "Potenciação";
    private static final String POTENCIA10    = "Potência10";
    private static final String LOGARITIMO    = "Logaritimo";
    private int BASE10                        = 10;
    private TextView tvResultado;
    private Spinner spiOpcoes;
    private EditText edtOperador1, edtOperador2;
    private Button btnCalcular;
    private ImageView imgOperacao;
    private ImageButton imgbDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
            if(actionBar != null){
                actionBar.setTitle("Calculadora do DEV");
            }


        tvResultado  = findViewById(R.id.tvResultado);
        spiOpcoes    = findViewById(R.id.spiOpcoes);
        edtOperador1 = findViewById(R.id.edtOperando1);
        edtOperador2 = findViewById(R.id.edtOperando2);
        btnCalcular  = findViewById(R.id.btnCalcular);
        imgOperacao  = findViewById(R.id.imgOperacao);
        imgbDelete   = findViewById(R.id.imgbDelete);

        imgOperacao.setVisibility(View.INVISIBLE);

        ArrayAdapter<String> adapterOpcoesMatematicas = new ArrayAdapter<String>(this
        , android.R.layout.simple_spinner_item
        , getResources().getStringArray(R.array.operacoes_matematica));
        adapterOpcoesMatematicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOpcoesMatematicas);
        spiOpcoes.setOnItemSelectedListener(this);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String opcaoselecionada = spiOpcoes.getSelectedItem().toString();

                if (opcaoselecionada.isEmpty()){
                    Toast.makeText(MainActivity.this, "Escolha um operador Matemático!", Toast.LENGTH_SHORT).show();

                }else if (edtOperador1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Adicione o primeiro valor!", Toast.LENGTH_SHORT).show();

                }else if (edtOperador2.getText().toString().isEmpty()){
                    setEdtOperador2Behavior(false);
                    Toast.makeText(MainActivity.this, "Adicione o segundo valor!", Toast.LENGTH_SHORT).show();

                }else if (opcaoselecionada.equals(DIVISAO)){
                    tvResultado.setText(dividir());

                }else if (opcaoselecionada.equals(MULTIPLICACAO)){
                    tvResultado.setText(multiplicar());

                }else if (opcaoselecionada.equals(SOMA)){
                    tvResultado.setText(somar());

                }else if(opcaoselecionada.equals(SUBTRACAO)){
                    tvResultado.setText(subtrair());

                }else if (opcaoselecionada.equals(RAIZQUADRADA)){
                    tvResultado.setText(raizQuadrada());

                }else if (opcaoselecionada.equals(POTENCIACAO)){
                    tvResultado.setText(potenciacao());

                }else if (opcaoselecionada.equals(POTENCIA10)){
                    tvResultado.setText(potencia10());

                }else if (opcaoselecionada.equals(LOGARITIMO)){
                    tvResultado.setText(logaritimo());
                }
            }
        });

        imgbDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                spiOpcoes.setAdapter(adapterOpcoesMatematicas);
                edtOperador1.setText("");
                edtOperador2.setText("");
                tvResultado.setText("");
                edtOperador1.setHint("");
                edtOperador2.setHint("");
            }
        });
    }

    private void setEdtOperador2Behavior(boolean block){
        if (block){
            //edtOperador2.setFocusable(false);
            edtOperador2.setEnabled(false);
            edtOperador2.setHint("Não editável");
        }else{
            //edtOperador2.setFocusable(true);
            edtOperador2.setEnabled(true);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        imgOperacao.setVisibility(View.VISIBLE);

        if (adapterView.getItemAtPosition(i).toString().equals(DIVISAO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
            edtOperador1.setHint("Dividendo");
            edtOperador2.setHint("Divisor");

        }else if (adapterView.getItemAtPosition(i).toString().equals(MULTIPLICACAO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
            edtOperador1.setHint("Multiplicando");
            edtOperador2.setHint("Multiplicador");

        }else if (adapterView.getItemAtPosition(i).toString().equals(SOMA)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
            edtOperador1.setHint("Parcela");
            edtOperador2.setHint("Parcela");

        }else if (adapterView.getItemAtPosition(i).toString().equals(SUBTRACAO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
            edtOperador1.setHint("Minuendo");
            edtOperador2.setHint("Subtraendo");

        }else if (adapterView.getItemAtPosition(i).toString().equals(RAIZQUADRADA)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.raizquadrada, getTheme()));
            edtOperador1.setHint("Radicando");
            edtOperador2.setHint("Não Utilizado");
            setEdtOperador2Behavior(true);

        }else if (adapterView.getItemAtPosition(i).toString().equals(POTENCIACAO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.x_elevado_y, getTheme()));
            edtOperador1.setHint("Potência");
            edtOperador2.setHint("Elevado");

        }else if (adapterView.getItemAtPosition(i).toString().equals(POTENCIA10)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.pot10, getTheme()));
            edtOperador1.setHint("Elevado");
            edtOperador2.setHint("Não Utilizado");
            setEdtOperador2Behavior(true);

        }else if (adapterView.getItemAtPosition(i).toString().equals(LOGARITIMO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.ic_log, getTheme()));
            edtOperador1.setHint("Log");
            edtOperador2.setHint("Não Utilizado");
            setEdtOperador2Behavior(true);

        }else{
            imgOperacao.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private String somar(){
        String resultado = "";
        int parcela = Integer.valueOf(edtOperador1.getText().toString()).intValue();
        int parcela2 = Integer.valueOf(edtOperador2.getText().toString()).intValue();
        resultado = String.valueOf(parcela + parcela2);

        return "O resultado da soma é: " + resultado;
    }

    private String multiplicar(){
        String resultado = "";
        int multiplicando = Integer.valueOf(edtOperador1.getText().toString()).intValue();
        int multiplicador = Integer.valueOf(edtOperador2.getText().toString()).intValue();
        resultado = String.valueOf(multiplicando * multiplicador);

        return "O resultado da multiplicação é: " + resultado;
    }

    private String dividir(){
        String resultado = "";
        int dividendo = Integer.valueOf(edtOperador1.getText().toString()).intValue();
        int divisor = Integer.valueOf(edtOperador2.getText().toString()).intValue();
        resultado = String.valueOf(dividendo / divisor);

        return "O resultado da divisão é: " + resultado;
    }

    private String subtrair(){
        String resultado = "";
        int minuendo = Integer.valueOf(edtOperador1.getText().toString()).intValue();
        int subtraendo = Integer.valueOf(edtOperador2.getText().toString()).intValue();
        resultado = String.valueOf(minuendo - subtraendo);

        return "O resultado da subtração é: " + resultado;
    }

    private String raizQuadrada(){
            String resultado = "";
            double radicando = Double.parseDouble(edtOperador1.getText().toString());
            resultado = String.valueOf(Math.sqrt(radicando));
        String format = String.format("%.2f", resultado);

        return "O resultado da raiz quadrada de: " + radicando + "é " + format;
    }

    private String potenciacao(){
        String resultado = "";
        double potencia = Double.parseDouble(edtOperador1.getText().toString());
        double elevado = Double.parseDouble(edtOperador2.getText().toString());
        resultado = String.valueOf(Math.pow(potencia, elevado));

        return "O resultado da Potenciação é: " + resultado;
    }

    private String potencia10(){
        String resultado = "";
        double elevado = Double.parseDouble(edtOperador1.getText().toString());

        resultado = String.valueOf(Math.pow(BASE10, elevado));

        return "O resultado da Potencia de 10" + resultado;
    }

    private String logaritimo(){
        String resultado = "";
        double log = Double.parseDouble(edtOperador1.getText().toString());

        resultado = String.valueOf(Math.log(log));

        return "O resultado do logaritimo é: " + resultado;
    }


}