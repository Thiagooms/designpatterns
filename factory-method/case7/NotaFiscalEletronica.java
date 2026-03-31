package case7;

public class NotaFiscalEletronica implements Faturamento {
    private static final double ALIQUOTA_NACIONAL = 0.12;

    @Override
    public double calcularTributo(double valor) {
        return valor * ALIQUOTA_NACIONAL;
    }

    @Override
    public double processarFaturamento(double valor) {
        return valor + calcularTributo(valor);
    }

    @Override
    public String registrarEmBanco() {
        return "A NF-e foi Registada com sucesso";
    }
}
