package case6.factory;

import case6.Autenticacao;
import case6.AutenticacaoJWT;

public class JwtFactory extends AutenticacaoFactory{

    @Override
    public Autenticacao criarAutenticacao() {
        return new AutenticacaoJWT();
    }
}
