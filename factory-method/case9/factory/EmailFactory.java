package case9.factory;

import case9.EmailNotificacao;
import case9.Notificacao;

public class EmailFactory extends NotificacaoFactory{

    @Override
    public Notificacao criarNotificacao() {
        EmailNotificacao emailNotificacao = new EmailNotificacao();
        emailNotificacao.configurarSMTP();
        return emailNotificacao;
    }
}
