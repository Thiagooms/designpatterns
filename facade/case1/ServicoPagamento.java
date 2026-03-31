package case1;

public class ServicoPagamento {

    public boolean processar(String cliente, double valor) {
        System.out.println("Pagamento: processando R$" + valor + " de " + cliente);
        return true;
    }
}
