public class TelaPrincipal {
    private ConfiguracaoSistema config;

    public TelaPrincipal() {
        this.config = ConfiguracaoSistema.getInstance();
        config.setTema("escuro");
    }

    public void exibir() {
        System.out.println("Tela principal com tema: " +
                config.getTema());
    }
}
