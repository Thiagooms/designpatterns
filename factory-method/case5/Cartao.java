package case5;

public class Cartao implements Pagamento{

    private static final double TAXA_PERCENTUAL = 1.035;

    @Override
    public double processar(double valor) {
        return TAXA_PERCENTUAL * valor;
    }
}
