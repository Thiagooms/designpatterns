package case4;

public class SedexFrete implements Frete {

    public static final double TAXA_FIXA_INTERNACIONAL = 70.90;

    @Override
    public double calcular(double peso, String destino) {
        return TAXA_FIXA_INTERNACIONAL * peso;
    }
}
