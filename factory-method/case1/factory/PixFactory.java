package case1.factory;

import case1.Pagamento;
import case1.PagamentoPix;

public class PixFactory extends PagamentoFactory{
    @Override
    public Pagamento metodoPagamento() {
        return new PagamentoPix();
    }
}
