package case6;

public class ImpostoRendaFixa implements Imposto{

    private static final double TAXA_ALIQUOTA = 0.225;

    @Override
    public double calcular(double lucro) {
        double imposto = lucro * TAXA_ALIQUOTA;
        System.out.println("Renda Fixa — alíquota 22,5%");
        System.out.println("Imposto devido: R$" + imposto);
        return imposto;
    }
}
