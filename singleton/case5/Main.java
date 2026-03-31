package case5;

public class Main {
    public static void main(String[] args) {
        ControllerUsuario usuarios = new ControllerUsuario();
        ControllerPedido pedidos = new ControllerPedido();

        usuarios.listarUsuarios();
        usuarios.listarUsuarios();
        pedidos.listarPedidos();

        ContadorDeRequisicoes contador = ContadorDeRequisicoes.getInstance();
        System.out.println("Total de requisições: " + contador.total());
        contador.relatorio();
    }
}
