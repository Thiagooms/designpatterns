package case3;

public class NotificacaoEmail implements Notificacao{

    @Override
    public void enviar(String destinatario, String messagem) {
        System.out.println("Email: " + destinatario + ", Conteúdo: " + messagem);
    }
}
