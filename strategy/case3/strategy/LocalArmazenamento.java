package case3.strategy;

public class LocalArmazenamento implements Armazenamento {

    @Override
    public void destino(String conteudo) {
        System.out.println("Salvando arquivo no disco local...");
        System.out.println("Conteúdo gravado: " + conteudo);
    }
}
