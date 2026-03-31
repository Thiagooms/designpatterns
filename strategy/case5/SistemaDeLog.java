package case5;

import case5.strategy.Destino;
import case5.strategy.Formato;

public class SistemaDeLog {

    private final Formato formato;
    private final Destino destino;

    public SistemaDeLog(Formato formato, Destino destino){
        this.formato = formato;
        this.destino = destino;
    }

    public void registrar(String nivel, String mensagem){
        String logFormatado = formato.formatar(nivel, mensagem);
        destino.saida(logFormatado);
    }
}
