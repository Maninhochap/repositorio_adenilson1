package almeida.adenilson.uno.junittesteunitario.forma;

public abstract class Forma {
    private double[] numeroDeMedidas;
    private int TAMANHO_MAXIMO = 3;

    public Forma(int numMedidas) {
        numeroDeMedidas = new double[numMedidas];
    }

    public double getMedida(int posicao){
        if (posicao >= 0 && posicao < TAMANHO_MAXIMO){
            return numeroDeMedidas[posicao];
        } else {
            throw new RuntimeException("Numero inválido p/ calculo da área.");
        }

    }

    public void setMedidas(int posicao, double medida){
        numeroDeMedidas[posicao] = medida;
    }

    public abstract double area();
}
