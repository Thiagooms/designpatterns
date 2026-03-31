package case4;

import case4.strategy.Desconto;
import case4.strategy.Pagamento;


public class ProcessadorDePagamento {

    private final Desconto desconto;
    private final Pagamento pagamento;

    public ProcessadorDePagamento(Desconto desconto, Pagamento pagamento){
        this.desconto = desconto;
        this.pagamento = pagamento;
    }

    public void processar(double valor){
        double valorFinal = desconto.calcularDesconto(valor);
        System.out.println(pagamento.processarPagamento(valorFinal));
    }
}
