package case7.factory;

import case7.Faturamento;
import case7.NotaFiscalEletronica;

public class NotaFiscalEletronicaFactory extends FaturamentoFactory {

    @Override
    public Faturamento criarFaturamento() {
        return new NotaFiscalEletronica();
    }
}
