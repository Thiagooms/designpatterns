package case5.factory;

import case5.Pagamento;

public abstract class PagamentoFactory {

    public abstract Pagamento criarPagamento();

    public void processar(double valor){
        Pagamento pagamento = criarPagamento();
        double resultado = pagamento.processar(valor);
        System.out.println("Valor da fatura: " + resultado);
    }
}
