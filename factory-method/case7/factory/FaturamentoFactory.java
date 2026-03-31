package case7.factory;

import case7.Faturamento;

public abstract class FaturamentoFactory {

    public abstract Faturamento criarFaturamento();

    public void processar(double valor) {
        Faturamento documento = criarFaturamento();
        System.out.println("Tributo:  " + documento.calcularTributo(valor));
        System.out.println("Total:    " + documento.processarFaturamento(valor));
        System.out.println(documento.registrarEmBanco());
    }
}
