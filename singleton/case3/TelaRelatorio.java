public class TelaRelatorio {
    private ConfiguracaoSistema config;

    public TelaRelatorio() {
        this.config = ConfiguracaoSistema.getInstance();
    }

    public void exibir() {
        System.out.println("Relatório com tema: " + config.getTema());
    }
}
