public class ServicoRelatorio {
    private GerenciadorConexao conexao;

    public ServicoRelatorio() {
        this.conexao = GerenciadorConexao.getInstance();
    }

    public void gerarRelatorio() {
        conexao.executarConsulta("SELECT * FROM pedidos");
    }
}
