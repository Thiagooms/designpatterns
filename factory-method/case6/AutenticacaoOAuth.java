package case6;

public class AutenticacaoOAuth implements Autenticacao{

    @Override
    public String autenticar(String usuario, String credencial) {
        return "oauth-interno." + usuario + ".trocado-de(" + credencial + ")";
    }
}
