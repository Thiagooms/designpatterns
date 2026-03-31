package case5.factory;

import case5.Pagamento;
import case5.Boleto;

public class BoletoFactory extends PagamentoFactory{

    @Override
    public Pagamento criarPagamento() {
        return new Boleto();
    }
}
