package case9;

public interface Notificacao {
    public String formatarMensagem(String destinatario, String mensagem);
    public String enviar();
    public String registrarEnvio();
}
