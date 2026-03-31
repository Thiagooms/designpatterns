package case7;

public class FaturaExportacao implements Faturamento {

    @Override
    public double processarFaturamento(double valor) {
        return valor;
    }

    @Override
    public double calcularTributo(double valor) {
        return 0;
    }

    @Override
    public String registrarEmBanco() {
        return "Fatura de Exportação registrada no banco com sucesso.";
    }
}
