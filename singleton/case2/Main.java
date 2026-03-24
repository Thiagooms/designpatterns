public class Main {
    public static void main(String[] args) {
        GerenciadorConexao.getInstance().conectar();

        ServicoUsuario servicoUsuario = new ServicoUsuario();
        ServicoRelatorio servicoRelatorio = new ServicoRelatorio();

        servicoUsuario.buscarUsuario(1);
        servicoUsuario.buscarUsuario(2);
        servicoRelatorio.gerarRelatorio();

        System.out.println("Total de consultas: " +
                GerenciadorConexao.getInstance().getTotalConsultas());
    }
}
