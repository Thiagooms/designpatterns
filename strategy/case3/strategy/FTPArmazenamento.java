package case3.strategy;

public class FTPArmazenamento implements Armazenamento {

    @Override
    public void destino(String conteudo) {
        System.out.println("Abrindo conexão FTP na porta 21...");
        System.out.println("Upload concluído: " + conteudo);
    }
}
