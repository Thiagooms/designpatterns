package case7.factory;

import case7.CupomFiscal;
import case7.Faturamento;

public class CupomFactory extends FaturamentoFactory {

    @Override
    public Faturamento criarFaturamento() {
        return new CupomFiscal();
    }
}
