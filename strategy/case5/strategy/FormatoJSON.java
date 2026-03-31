package case5.strategy;

public class FormatoJSON implements Formato{

    @Override
    public String formatar(String nivel, String mensagem) {
        System.out.println("Formatando log como JSON...");
        return "{\"nivel\": \"" + nivel + "\", \"mensagem\": \"" + mensagem + "\"}";
    }
}
