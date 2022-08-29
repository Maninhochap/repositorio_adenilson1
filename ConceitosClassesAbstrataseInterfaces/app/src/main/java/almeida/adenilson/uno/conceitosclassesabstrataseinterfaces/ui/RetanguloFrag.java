package almeida.adenilson.uno.conceitosclassesabstrataseinterfaces.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import almeida.adenilson.uno.conceitosclassesabstrataseinterfaces.R;
import almeida.adenilson.uno.conceitosclassesabstrataseinterfaces.forma.Retangulo;


public class RetanguloFrag extends Fragment {
    private EditText edtBase, edtAltura;
    private TextView tvAreaRetangulo;

    public RetanguloFrag() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layoutFragment = inflater.inflate(R.layout.fragment_retangulo, container, false);

        edtBase         = layoutFragment.findViewById(R.id.edtBase);
        edtAltura       = layoutFragment.findViewById(R.id.edtLado2);
        ImageButton imgbCalcular = layoutFragment.findViewById(R.id.imgbCalcularRetangulo);
        ImageButton imgbLimpar = layoutFragment.findViewById(R.id.imgbLimparRetangulo);
        tvAreaRetangulo = layoutFragment.findViewById(R.id.tvAreaRetangulo);

        imgbCalcular.setOnClickListener(view -> {
            if(edtBase.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe a base do retângulo!", Toast.LENGTH_SHORT).show();

            } else if(edtAltura.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe a altura do retângulo!", Toast.LENGTH_SHORT).show();

            } else{
                Retangulo retangulo = new Retangulo(Double.parseDouble(edtBase.getText().toString())
                        , Double.parseDouble(edtAltura.getText().toString()));

                String areaFormatada = new DecimalFormat("#,##0.00").format(retangulo.area());
                tvAreaRetangulo.setText(areaFormatada);
            }
        });

        imgbLimpar.setOnClickListener(view -> {
            edtBase.setText("");
            edtAltura.setText("");
            tvAreaRetangulo.setText("");
        });

        return layoutFragment;
    }
}