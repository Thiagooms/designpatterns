package case2.factory;

import case2.Relatorio;

public abstract class RelatorioFactory {

    //método abstrato criacional
    protected abstract Relatorio criarRelatorio();

    public String gerarRelatorio(String dados){
        Relatorio relatorio = criarRelatorio();
        return relatorio.gerar(dados);
    }
}
