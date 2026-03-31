package case8;

public class EmprestimoConsignado implements Emprestimo {
    public static final double TAXA_CONSIGNADO = 0.015;

    @Override
    public double calcularJuros(double valor) {
        return valor * TAXA_CONSIGNADO;
    }

    @Override
    public double calcularTotal(double valor) {
        return valor + calcularJuros(valor);
    }

    @Override
    public String registrarContrato() {
        return "Contrato de empréstimo consignado registrado com sucesso!";
    }
}
