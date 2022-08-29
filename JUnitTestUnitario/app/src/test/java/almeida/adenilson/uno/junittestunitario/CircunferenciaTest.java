package almeida.adenilson.uno.junittestunitario;

import org.junit.Test;
import static org.junit.Assert.*;
import static almeida.adenilson.uno.junittestunitario.forma.Circunferencia.EXPOENTE_2;
import static almeida.adenilson.uno.junittestunitario.forma.Circunferencia.POSICAO_ZERO;

import java.lang.Math;

import almeida.adenilson.uno.junittestunitario.forma.Circunferencia;
import almeida.adenilson.uno.junittestunitario.forma.Circunferencia;

public class CircunferenciaTest {
    //private static Circunferencia circunferencia = new Circunferencia(10);
    private static Circunferencia circunferencia = new Circunferencia();


    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas() {

        circunferencia.setMedidas(0, 3);
        //posicão Zero por se tratar de uma circunferencia que precisa de apenas uma informação p/ calcular a área.
        double raio = circunferencia.getMedida(0);
        boolean x = raio > 0;
        assertTrue(x);

    }

    @Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInformacoesDoCalculoDaArea() {
        final int TAMANHO = 1;
        assertEquals(TAMANHO, circunferencia.getTamanhoArrayInfoCalculoArea());
        //boolean tamanhoValido = Circunferencia.setMedidas(0, 3) > circunferencia;

    }

    @Test
    public void deveriaCalcularAreaDaCircunferencia() {
        //O calculo da área de uma circunferencia é dada pela fórmula: A = PI * Raio ao quadrado
        int PRECISAO_4_CASAS_DECIMAIS = 4;

        //Valores claulados no papel e caneta
        double area_raio3 = 28.2743;
        double area_raio4 = 50.2655;
        double area_raio5 = 78.5398;

        //Raio armazenado na extrutura de dados da classe Pai (Forma)
        circunferencia.setMedidas(POSICAO_ZERO, 4);

        double area = Math.PI * Math.pow(circunferencia.getMedida(POSICAO_ZERO), EXPOENTE_2);


//        assertEquals("A área de uma circunferencia de raio 3 é 28,2743"
//                , area_raio3
//                , area
//                , PRECISAO_4_CASAS_DECIMAIS);
        assertEquals("A área de uma circunferencia de raio 4 é 50,2655"
                , area_raio4
                , area
                , PRECISAO_4_CASAS_DECIMAIS);
//        assertEquals("A área de uma circunferencia de raio 5 é 78,5398"
//                , area_raio5
//                , area
//                , PRECISAO_4_CASAS_DECIMAIS);

        


    }

}
