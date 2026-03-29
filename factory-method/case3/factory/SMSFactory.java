package case3.factory;

import case3.Notificacao;
import case3.NotificacaoSMS;

public class SMSFactory extends NotificacaoFactory {

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
