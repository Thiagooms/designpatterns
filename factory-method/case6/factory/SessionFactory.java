package case6.factory;

import case6.Autenticacao;
import case6.AutenticacaoSession;

public class SessionFactory extends AutenticacaoFactory{

    @Override
    public Autenticacao criarAutenticacao() {
        return new AutenticacaoSession();
    }
}
