public class ServicoUsuario {
    private GerenciadorConexao conexao;

    public ServicoUsuario() {
        this.conexao = GerenciadorConexao.getInstance();
    }

    public void buscarUsuario(int id) {
        conexao.executarConsulta("SELECT * FROM usuarios WHERE id = " + id);
    }
}
