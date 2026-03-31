package case6;

public class ImpostoFII implements Imposto {
    private static final double TAXA_LUCRO_TRIBUTAVEL = 0.7;
    private static final double TAXA_IMPOSTO = 0.20;

    @Override
    public double calcular(double lucro) {
        double lucroTributavel = lucro * TAXA_LUCRO_TRIBUTAVEL;
        double imposto = lucroTributavel * TAXA_IMPOSTO;
        System.out.println("FII — 20% sobre 70% do lucro (30% isentos como dividendos)");
        System.out.println("Imposto devido: R$" + imposto);
        return imposto;
    }
}
