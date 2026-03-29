package case3.factory;

import case3.Notificacao;
import case3.NotificacaoPush;

public class PushFactory extends NotificacaoFactory{

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
