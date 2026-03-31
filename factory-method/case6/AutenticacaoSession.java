package case6;

public class AutenticacaoSession implements Autenticacao{

    @Override
    public String autenticar(String usuario, String credencial) {
        return "session-id." + usuario + "-" + Math.abs(credencial.hashCode());
    }
}