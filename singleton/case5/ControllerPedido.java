package case5;

public class ControllerPedido {
    private ContadorDeRequisicoes contador = ContadorDeRequisicoes.getInstance();

    public void listarPedidos() {
        contador.registrar("/pedidos");
    }
}
