package case3;

import case3.strategy.CompresaoZIP;
import case3.strategy.CompressaoGZIP;
import case3.strategy.FTPArmazenamento;
import case3.strategy.LocalArmazenamento;
import case3.strategy.NenhumCompressao;
import case3.strategy.S3Armazenamento;

public class Main {
    public static void main(String[] args) {

        String conteudo = "relatorio-mensal.txt";

        System.out.println("=== ZIP + LOCAL ===");
        new GerenciadorDeArquivos(new LocalArmazenamento(), new CompresaoZIP()).comprimirEArmazenar(conteudo);

        System.out.println("\n=== GZIP + S3 ===");
        new GerenciadorDeArquivos(new S3Armazenamento(), new CompressaoGZIP()).comprimirEArmazenar(conteudo);

        System.out.println("\n=== NENHUM + FTP ===");
        new GerenciadorDeArquivos(new FTPArmazenamento(), new NenhumCompressao()).comprimirEArmazenar(conteudo);
    }
}
