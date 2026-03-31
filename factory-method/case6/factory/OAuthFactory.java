package case6.factory;

import case6.Autenticacao;
import case6.AutenticacaoOAuth;

public class OAuthFactory extends AutenticacaoFactory{

    @Override
    public Autenticacao criarAutenticacao() {
        return new AutenticacaoOAuth();
    }
}
