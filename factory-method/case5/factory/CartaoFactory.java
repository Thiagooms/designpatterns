package case5.factory;

import case5.Cartao;
import case5.Pagamento;

public class CartaoFactory extends PagamentoFactory{

    @Override
    public Pagamento criarPagamento() {
        return new Cartao();
    }
}
