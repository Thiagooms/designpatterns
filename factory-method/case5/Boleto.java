package case5;

public class Boleto implements Pagamento{
    private static final double TAXA_FIXA = 3.50;

    @Override
    public double processar(double valor) {
        return valor + TAXA_FIXA;
    }
}
