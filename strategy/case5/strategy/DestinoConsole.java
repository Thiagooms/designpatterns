package case5.strategy;

public class DestinoConsole implements Destino {

    @Override
    public void saida(String logFormatado) {
        System.out.println("Saída no console: " + logFormatado);
    }
}
