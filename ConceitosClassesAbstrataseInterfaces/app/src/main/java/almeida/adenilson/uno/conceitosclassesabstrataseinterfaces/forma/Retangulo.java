package almeida.adenilson.uno.conceitosclassesabstrataseinterfaces.forma;


public class Retangulo extends Forma {
    public Retangulo(double altura, double largura) {
        super(2); // uso obrigatório do construtor da superclasse
        setMedida(0, altura); // ajuste da medida da altura
        setMedida(1, largura); // ajuste da medida da largura
    }

    // implementação do método abstrato area()
    @Override
    public double area() {
        return getMedida(0) * getMedida(1);
    }

    // implementação de operação especifica extra
    public double perimetro() {
        return 2 * (getMedida(0) + getMedida(1));
    }
}
