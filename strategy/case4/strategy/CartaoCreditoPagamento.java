package case4.strategy;

public class CartaoCreditoPagamento implements Pagamento {

    @Override
    public String processarPagamento(double valorFinal) {
        System.out.println("Processando pagamento no cartão de crédito...");
        return "Cobrança de R$" + valorFinal + " aprovada.";
    }
}
