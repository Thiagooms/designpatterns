package case8;

public class EmprestimoPessoal implements Emprestimo {
    public static final double TAXA_PESSOAL = 0.03;

    @Override
    public double calcularJuros(double valor) {
        return valor * TAXA_PESSOAL;
    }

    @Override
    public double calcularTotal(double valor) {
        return valor + calcularJuros(valor);
    }

    @Override
    public String registrarContrato() {
        return "Contrato de empréstimo pessoal registrado com sucesso!";
    }
}
