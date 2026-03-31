package case4;

public class Main {
    public static void main(String[] args) {
        ServicoUsuario usuario = new ServicoUsuario();
        ServicoProduto produto = new ServicoProduto();

        usuario.salvarSessao("thiago");
        produto.verificarSessao("thiago");

        System.out.println("Tamanho do cache: " + GerenciadorDeCache.getInstance().tamanho());
    }
}
