package case1.strategy;

public class EmailEntrega implements EntregaDados {

    @Override
    public void entregar(String payload) {
        System.out.println("Conectando ao servidor SMTP...");
        System.out.println("Enviando email com anexo:\n" + payload);
    }
}
