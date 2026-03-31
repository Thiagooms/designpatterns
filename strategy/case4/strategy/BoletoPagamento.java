package case4.strategy;

public class BoletoPagamento implements Pagamento {

    @Override
    public String processarPagamento(double valorFinal) {
        System.out.println("Gerando boleto bancário...");
        return "Boleto de R$" + valorFinal + " emitido com vencimento em 3 dias.";
    }
}
