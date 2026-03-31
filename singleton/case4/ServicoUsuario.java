package case4;

public class ServicoUsuario {

    private GerenciadorDeCache cache = GerenciadorDeCache.getInstance();

    public void salvarSessao(String usuario) {
        cache.adicionar("sessao_" + usuario, "ativa");
    }
}
