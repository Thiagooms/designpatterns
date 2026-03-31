package case7;

public class CupomFiscal implements Faturamento {
    private static final double ALIQUOTA_NACIONAL = 0.07;

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
        return "Cupom Fiscal registrado no banco com sucesso.";
    }
}
