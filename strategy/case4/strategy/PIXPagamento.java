package case4.strategy;

public class PIXPagamento implements Pagamento {

    @Override
    public String processarPagamento(double valorFinal) {
        System.out.println("Gerando chave PIX...");
        return "Transferência de R$" + valorFinal + " confirmada.";
    }
}
