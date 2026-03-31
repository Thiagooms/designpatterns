package case4;

public class ServicoProduto {

    private GerenciadorDeCache cache = GerenciadorDeCache.getInstance();

    public void verificarSessao(String usuario) {
        String sessao = cache.buscar("sessao_" + usuario);
        System.out.println("Sessão de " + usuario + ": " + sessao);
    }
}
