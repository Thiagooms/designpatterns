package case6;

public class AutenticacaoJWT implements Autenticacao{

    @Override
    public String autenticar(String usuario, String credencial) {
        return "jwt." + usuario + ".assinado-com-hash(" + credencial.hashCode() + ")";
    }
}
