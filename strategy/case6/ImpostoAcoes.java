package case6;

public class ImpostoAcoes implements Imposto {
    private static final double LUCRO_MINIMO = 20000;

    @Override
    public double calcular(double lucro) {
        if (lucro <= LUCRO_MINIMO){
            System.out.println("Ações — lucro abaixo de R$20.000, isento de IR.");
            return 0;
        }
        double imposto = lucro * 0.15;
        System.out.println("Ações — alíquota 15%");
        System.out.println("Imposto devido: R$" + imposto);
        return imposto;
    }
}
