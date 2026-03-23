package case1.factory;

import case1.Pagamento;
import case1.PagamentoCartao;

public class CartaoCreditoFactory extends PagamentoFactory{

    @Override
    public Pagamento metodoPagamento() {
        return new PagamentoCartao();
    }
}
