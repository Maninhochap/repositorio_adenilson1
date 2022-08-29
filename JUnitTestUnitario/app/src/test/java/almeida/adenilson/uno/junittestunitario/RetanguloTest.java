package almeida.adenilson.uno.junittestunitario;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import almeida.adenilson.uno.junittestunitario.forma.Retangulo;
import almeida.adenilson.uno.junittestunitario.forma.Retangulo;

public class RetanguloTest {
    private Retangulo retangulo = new Retangulo();
    double DIFERENCA_ACEITAVEL = 0.0001;


    @Test
    public void calcularAreaDoRetangulo() {
        double area_BaseXAltura = 12;

        retangulo.setMedidas(0, 3);
        retangulo.setMedidas(1, 4);
        double area = retangulo.getMedida(0) * retangulo.getMedida(1);

        assertEquals("A área do retangulo " + area_BaseXAltura
                , area_BaseXAltura
                , area
                , DIFERENCA_ACEITAVEL);
    }

    @Test
    public void calcularAreaDoPerimetroDoRetangulo(){
        final int BASE                   = 0;
        final int ALTURA                 = 1;
        double perimetroCalculadoNoPapel = 12;

        retangulo.setMedidas(0, 2);
        retangulo.setMedidas(1, 5);

        double perimetro = 2 * (retangulo.getMedida(BASE) + retangulo.getMedida(ALTURA));


        assertEquals("O perimetro do retangulo é: " + perimetroCalculadoNoPapel
                , perimetroCalculadoNoPapel
                , perimetro
                , DIFERENCA_ACEITAVEL);

    }

}