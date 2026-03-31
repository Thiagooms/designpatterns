package case3.strategy;

public class S3Armazenamento implements Armazenamento {

    @Override
    public void destino(String conteudo) {
        System.out.println("Conectando ao bucket S3...");
        System.out.println("Upload concluído: " + conteudo);
    }
}
