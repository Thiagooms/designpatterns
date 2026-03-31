package case5.factory;

import case5.Pagamento;
import case5.Pix;

public class PixFactory extends PagamentoFactory {

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }
}
