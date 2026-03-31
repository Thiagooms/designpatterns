package case5.strategy;

public class FormatoTexto implements Formato {

    @Override
    public String formatar(String nivel, String mensagem) {
        System.out.println("Formatando log como texto simples...");
        return "[" + nivel + "] " + mensagem;
    }
}
