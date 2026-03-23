package case1.factory;

import case1.Pagamento;
import case1.PagamentoBoleto;

public class BoletoFactory extends PagamentoFactory{

    @Override
    public Pagamento metodoPagamento() { return new PagamentoBoleto(); }
}
