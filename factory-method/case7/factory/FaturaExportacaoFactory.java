package case7.factory;

import case7.FaturaExportacao;
import case7.Faturamento;

public class FaturaExportacaoFactory extends FaturamentoFactory {

    @Override
    public Faturamento criarFaturamento() {
        return new FaturaExportacao();
    }
}
