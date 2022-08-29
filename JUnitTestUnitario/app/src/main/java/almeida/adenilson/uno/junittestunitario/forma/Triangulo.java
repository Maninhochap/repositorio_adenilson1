package almeida.adenilson.uno.junittestunitario.forma;

public class Triangulo extends Forma{
    private static final int POSICAO_ZERO_LADO1 = 0;
    private static final int POSICAO_UM_LADO2 = 1;
    private static final int POSICAO_DOIS_LADO3 = 2;
    private static final int TAMANHO_MAXIMO_ARRAY_INFO_CALCULO_AREA = 3;

    public Triangulo() {
        super(TAMANHO_MAXIMO_ARRAY_INFO_CALCULO_AREA);
    }

    @Override
    public double area() {
        double perimetro = (getMedida(POSICAO_ZERO_LADO1) + getMedida(POSICAO_UM_LADO2)
                + getMedida(POSICAO_DOIS_LADO3)) / 2;

        double area = perimetro * (perimetro - getMedida(POSICAO_ZERO_LADO1))
                * (perimetro - getMedida(POSICAO_UM_LADO2))
                * (perimetro - getMedida(POSICAO_DOIS_LADO3));

        return Math.sqrt(area);


    }
}
