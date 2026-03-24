package case2.factory;

import case2.Relatorio;
import case2.RelatorioEXCEL;

public class ExcelFactory extends RelatorioFactory{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEXCEL();
    }
}
