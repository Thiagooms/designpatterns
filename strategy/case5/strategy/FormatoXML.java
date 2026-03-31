package case5.strategy;

public class FormatoXML implements Formato {
    @Override
    public String formatar(String nivel, String mensagem) {
        System.out.println("Formatando log como XML...");
        return "<log><nivel>" + nivel + "</nivel><mensagem>" + mensagem + "</mensagem></log>";
    }
}
