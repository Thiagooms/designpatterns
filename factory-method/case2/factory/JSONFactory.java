package case2.factory;

import case2.Relatorio;
import case2.RelatorioJSON;

public class JSONFactory extends RelatorioFactory{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioJSON();
    }
}
