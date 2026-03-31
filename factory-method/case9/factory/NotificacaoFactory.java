package case9.factory;

import case9.Notificacao;

public abstract class NotificacaoFactory {

    public abstract Notificacao criarNotificacao();

    public void processarNotificacao(String destinatario, String mensagem){
        Notificacao notificacao = criarNotificacao();
        System.out.println(notificacao.formatarMensagem(destinatario, mensagem));
        System.out.println(notificacao.enviar());
        System.out.println(notificacao.registrarEnvio());
    }
}
