package case8;

public class EmprestimoImobiliario implements Emprestimo{
    public static final double TAXA_IMOBILIARIO = 0.007;

    @Override
    public double calcularJuros(double valor) {
        return valor * TAXA_IMOBILIARIO;
    }

    @Override
    public double calcularTotal(double valor) {
        return valor + calcularJuros(valor);
    }

    @Override
    public String registrarContrato() {
        return "Contrato de empréstimo imobiliário registrado com sucesso!";
    }
}
