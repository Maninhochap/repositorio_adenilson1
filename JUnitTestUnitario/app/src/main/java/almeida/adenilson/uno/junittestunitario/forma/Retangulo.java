package almeida.adenilson.uno.junittestunitario.forma;

public class Retangulo extends Forma{
    private static final int TAMANHO_MAXIMO_ARRAY_INFO_CALCULO_AREA = 2;
    private static final int BASE = 0;
    private static final int ALTURA = 1;

    public Retangulo(){
        super(TAMANHO_MAXIMO_ARRAY_INFO_CALCULO_AREA);
    }
    public double calcularPerimetro(){
        return 2 * (getMedida(BASE) + getMedida(ALTURA));

    }


    @Override
    public double area() {
        return getMedida(BASE) * getMedida(ALTURA);
    }
}
