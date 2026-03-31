package case4.strategy;

public class DescontoVIP implements Desconto {

    @Override
    public double calcularDesconto(double valor) {
        double valorFinal = valor * 0.85;
        System.out.println("Desconto VIP de 15% aplicado. Novo valor: R$" + valorFinal);
        return valorFinal;
    }
}
