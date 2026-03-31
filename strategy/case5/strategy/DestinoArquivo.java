package case5.strategy;

public class DestinoArquivo implements Destino {

    @Override
    public void saida(String logFormatado) {
        System.out.println("Escrevendo no arquivo de log...");
        System.out.println("Conteúdo gravado: " + logFormatado);
    }
}
