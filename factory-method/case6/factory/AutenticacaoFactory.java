package case6.factory;

import case6.Autenticacao;

public abstract class AutenticacaoFactory {

    public abstract Autenticacao criarAutenticacao();

    public void autenticar(String usuario, String credencial) {
        Autenticacao autenticacao = criarAutenticacao();
        String resultado = autenticacao.autenticar(usuario, credencial);
        System.out.println("Usuário autenticado: " + resultado);
    }
}
