package case9.factory;

import case9.Notificacao;
import case9.PushNotificacao;

public class PushFactory extends NotificacaoFactory{

    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}
