package case3.factory;

import case3.Notificacao;
import case3.NotificacaoEmail;

public class EmailFactory extends NotificacaoFactory {

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
