package case9;

public class PushNotificacao implements Notificacao{
    @Override
    public String formatarMensagem(String destinatario, String mensagem) {
        return "Destinatário: " + destinatario + "Mensagem: " + mensagem;
    }

    @Override
    public String enviar() {
        return "Mensagem enviada com sucesso!";
    }

    @Override
    public String registrarEnvio() {
        return "Envio Registrado!";
    }

    public String configurarDispositivo(){
        return "Token válido, configuração feita com sucesso!";
    }
}
