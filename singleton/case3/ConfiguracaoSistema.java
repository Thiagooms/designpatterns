public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instance;
    private String tema;
    private String idioma;
    private int timeoutSegundos;

    private ConfiguracaoSistema() {
        System.out.println("Carregando configurações do sistema...");
        this.tema = "claro";
        this.idioma = "pt-BR";
        this.timeoutSegundos = 30;
    }

    public static ConfiguracaoSistema getInstance() {
        if (instance == null) {
            synchronized (ConfiguracaoSistema.class) {
                if (instance == null) {
                    instance = new ConfiguracaoSistema();
                }
            }
        }
        return instance;
    }

    public void setTema(String tema) { this.tema = tema; }
    public void setIdioma(String idioma) { this.idioma = idioma; }
    public void setTimeout(int segundos) { this.timeoutSegundos = segundos; }

    public String getTema() { return tema; }
    public String getIdioma() { return idioma; }
    public int getTimeout() { return timeoutSegundos; }
}
