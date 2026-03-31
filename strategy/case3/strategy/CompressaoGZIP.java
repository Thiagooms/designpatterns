package case3.strategy;

public class CompressaoGZIP implements Compressao {

    @Override
    public String comprimir(String conteudo) {
        System.out.println("Comprimindo com GZIP...");
        return "[GZIP]" + conteudo;
    }
}
