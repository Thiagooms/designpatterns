package case1;

public class ServicoEmail {

    public void enviarConfirmacao(String cliente, String produto) {
        System.out.println("Email: confirmação enviada para " + cliente + " — pedido: " + produto);
    }
}
