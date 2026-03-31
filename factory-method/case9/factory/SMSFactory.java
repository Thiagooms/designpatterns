package case9.factory;

import case9.Notificacao;
import case9.SMSNotificacao;

public class SMSFactory extends NotificacaoFactory {

    @Override
    public Notificacao criarNotificacao() {
        return new SMSNotificacao();
    }
}
