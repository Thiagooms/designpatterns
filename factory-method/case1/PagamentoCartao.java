package case1;

public class PagamentoCartao implements Pagamento {

    private static final double TAXA = 1.0;

    @Override
    public double processar(double valor) {
        return valor * TAXA;
    }
}
