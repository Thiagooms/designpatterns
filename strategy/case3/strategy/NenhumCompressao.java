package case3.strategy;

public class NenhumCompressao implements Compressao {

    @Override
    public String comprimir(String conteudo) {
        System.out.println("Sem compressão, mantendo arquivo original...");
        return conteudo;
    }
}
