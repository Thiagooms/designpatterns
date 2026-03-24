public class GerenciadorConexao {
    private static GerenciadorConexao instance;
    private boolean conectado;
    private int totalConsultas;

    private GerenciadorConexao() {
        this.conectado = false;
        this.totalConsultas = 0;
        System.out.println("Conexão criada");
    }

    public static GerenciadorConexao getInstance() {
        if (instance == null) {
            synchronized (GerenciadorConexao.class) {
                if (instance == null) {
                    instance = new GerenciadorConexao();
                }
            }
        }
        return instance;
    }

    public void conectar() {
        this.conectado = true;
    }

    public void executarConsulta(String sql) {
        if (!conectado) {
            System.out.println("Erro: sem conexão ativa");
            return;
        }
        totalConsultas++;
        System.out.println("Executando: " + sql + " | total desta instância: " + totalConsultas);
    }

    public int getTotalConsultas() {
        return totalConsultas;
    }
}
