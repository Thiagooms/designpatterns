package case4;

public class LocalFrete implements Frete {

    private static final double DESCONTO_LOCAL = 0.20;
    private static final double FRETE_PADRAO = 29.99;
    private static final String CIDADE_LOCAL = "PB";

    @Override
    public double calcular(double peso, String destino) {
        double freteBase = FRETE_PADRAO * peso;
        double desconto = freteBase * DESCONTO_LOCAL;

        if(destino.equals(CIDADE_LOCAL)){
            return freteBase - desconto;
        }
        return freteBase;
    }
}
