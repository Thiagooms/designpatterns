package case4.factory;

import case4.Frete;

public abstract class FreteFactory {

    protected abstract Frete criarFrete();

    public void criarFrete(double peso, String destino){
        Frete frete = criarFrete();
        double resultado = frete.calcular(peso, destino);
        System.out.println("Frete: R$ " + resultado + ", Destino: " + destino);
    }
}
