package case1.factory;

import case1.Pagamento;

public abstract class PagamentoFactory {

    public abstract Pagamento metodoPagamento();

    public double processar(double valor){
        Pagamento pagamento = metodoPagamento();
        return pagamento.processar(valor);
    }

}
