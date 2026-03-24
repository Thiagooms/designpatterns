package case2.factory;

import case2.Relatorio;
import case2.RelatorioPDF;

public class PDFFactory extends RelatorioFactory{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
