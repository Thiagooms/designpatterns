package case1;

public class PagamentoBoleto implements Pagamento {

    private static final double TAXA = 0.2;

    public double processar(double valor){
        return valor * TAXA;
    }
}
