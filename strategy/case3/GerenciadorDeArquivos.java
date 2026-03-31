package case3;

import case3.strategy.Armazenamento;
import case3.strategy.Compressao;

public class GerenciadorDeArquivos {

    private final Armazenamento armazenamento;
    private final Compressao compressao;

    public GerenciadorDeArquivos(Armazenamento armazenamento, Compressao compressao){
        this.armazenamento = armazenamento;
        this.compressao = compressao;
    }

    public void comprimirEArmazenar(String conteudo){
        String conteudoComprimido = compressao.comprimir(conteudo);
        armazenamento.destino(conteudoComprimido);
    }
}
