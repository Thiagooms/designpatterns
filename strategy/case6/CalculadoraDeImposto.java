package case6;

public class CalculadoraDeImposto {

    private final Imposto imposto;

    public CalculadoraDeImposto(Imposto imposto){
        this.imposto = imposto;
    }

    public double calcular(double lucro){
        return imposto.calcular(lucro);
    }
}
