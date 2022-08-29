package almeida.adenilson.uno.junittesteunitario;

import org.junit.Test;

import almeida.adenilson.uno.junittesteunitario.forma.Retangulo;

public class RetanguloTest {
    private static Retangulo retangulo = new Retangulo();
    private static Retangulo base = new Retangulo();
    private static Retangulo altura = new Retangulo();


    @Test
    public void calcularAreaDoRetangulo(){
        double area_BaseXAltura = 12;
        int PRECISAO_4_CASA_DECIMAIS = 4;
        retangulo.setMedidas(0, 3);
        retangulo.setMedidas(1, 4);
        double area = retangulo.getMedida(0) * retangulo.getMedida(1);

    }



    @Test
    public void calcularAreaDoPerimetroDoRetangulo(){

    }
}