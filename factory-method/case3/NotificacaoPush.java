package case3;

public class NotificacaoPush implements Notificacao{

    @Override
    public void enviar(String destinatario, String messagem) {
        System.out.println("Push: " + destinatario + ", Conteúdo: " + messagem);
    }
}
