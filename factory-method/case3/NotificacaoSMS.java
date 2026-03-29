package case3;

public class NotificacaoSMS implements Notificacao{

    @Override
    public void enviar(String destinatario, String messagem) {
        System.out.println("SMS: " + destinatario + ", Conteúdo: " + messagem);
    }
}
