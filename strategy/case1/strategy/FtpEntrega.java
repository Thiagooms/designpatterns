package case1.strategy;

public class FtpEntrega implements EntregaDados {

    @Override
    public void entregar(String payload) {
        System.out.println("Abrindo conexão FTP na porta 21...");
        System.out.println("Fazendo upload do arquivo com o conteúdo:\n" + payload);
    }
}
