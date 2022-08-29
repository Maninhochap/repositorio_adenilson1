package almeida.adenilson.uno.junittestunitario;

import almeida.adenilson.uno.junittestunitario.forma.Triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrianguloTest {
    public static final int POSICAO_ZERO_LADO_1 = 0;
    public static final int POSICAO_UM_LADO_2 = 1;
    public static final int POSICAO_DOIS_LADO_3 = 2;
    private Triangulo triangulo = new Triangulo();

    @Test
    public void deveriaCalcularAreaDoTriangulo() {
        double areaDoTrianguloCalculadoPapel = 17.4123;
        double DIFERENCA_ACETAVEL = 0.0001;

        triangulo.setMedidas(POSICAO_ZERO_LADO_1, 5);
        triangulo.setMedidas(POSICAO_UM_LADO_2, 6);
        triangulo.setMedidas(POSICAO_DOIS_LADO_3, 9);

        double x = (triangulo.getMedida(POSICAO_ZERO_LADO_1)
                + triangulo.getMedida(POSICAO_UM_LADO_2)
                + triangulo.getMedida(POSICAO_DOIS_LADO_3)) / 2;

        double y = x * (x - triangulo.getMedida(POSICAO_ZERO_LADO_1))
                * (x - triangulo.getMedida(POSICAO_UM_LADO_2))
                * (x - triangulo.getMedida(POSICAO_DOIS_LADO_3));

        double area = Math.sqrt(y);

        assertEquals("A área calculado no Papel é: " + areaDoTrianguloCalculadoPapel
                , areaDoTrianguloCalculadoPapel
                , area
                , DIFERENCA_ACETAVEL);

    }
}