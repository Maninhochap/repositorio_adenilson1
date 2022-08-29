package almeida.adenilson.uno.conceitofragments;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import almeida.adenilson.uno.conceitofragments.TextoFragment;
import almeida.adenilson.uno.conceitofragments.ToolbarFragment;

public class MainActivity extends FragmentActivity implements ToolbarFragment.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onButtonClick(int tamanhofonte, String texto) {
        almeida.adenilson.uno.conceitofragments.TextoFragment textoFragment = (TextoFragment) getSupportFragmentManager().findFragmentById(R.id.frgTexto);

        textoFragment.trocarPropriedadesDoTexto(tamanhofonte, texto);

    }
}