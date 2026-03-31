package case3.strategy;

public class CompresaoZIP implements Compressao {

    @Override
    public String comprimir(String conteudo) {
        System.out.println("Comprimindo com ZIP...");
        return "[ZIP]" + conteudo;
    }
}
