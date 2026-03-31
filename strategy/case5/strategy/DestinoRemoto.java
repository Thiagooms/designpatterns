package case5.strategy;

public class DestinoRemoto implements Destino {

    @Override
    public void saida(String logFormatado) {
        System.out.println("Enviando log para servidor remoto...");
        System.out.println("Payload enviado: " + logFormatado);
    }
}
