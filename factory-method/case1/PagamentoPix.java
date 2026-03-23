package case1;

public class PagamentoPix implements Pagamento {

    private static final double TAXA = 0.5;

    @Override
    public double processar(double valor){
        return valor * TAXA;
    }
}
