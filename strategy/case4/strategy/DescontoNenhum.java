package case4.strategy;

public class DescontoNenhum implements Desconto {

    @Override
    public double calcularDesconto(double valor) {
        System.out.println("Sem desconto. Valor: R$" + valor);
        return valor;
    }
}
