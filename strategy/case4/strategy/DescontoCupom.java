package case4.strategy;

public class DescontoCupom implements Desconto {

    @Override
    public double calcularDesconto(double valor) {
        double valorFinal = valor - 20.0;
        System.out.println("Cupom de R$20,00 aplicado. Novo valor: R$" + valorFinal);
        return valorFinal;
    }
}
