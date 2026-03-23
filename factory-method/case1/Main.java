package case1;

import case1.factory.BoletoFactory;
import case1.factory.CartaoCreditoFactory;
import case1.factory.PixFactory;

public class Main {

    public static void main(String[] args) {

        BoletoFactory boletoFactory = new BoletoFactory();
        double valorBoleto = boletoFactory.processar(25.5);
        System.out.println(valorBoleto);

        CartaoCreditoFactory cartaoCreditoFactory = new CartaoCreditoFactory();
        double valorCartao = cartaoCreditoFactory.processar(25.5);
        System.out.println(valorCartao);

        PixFactory pixFactory = new PixFactory();
        double valorPix = pixFactory.processar(25.5);
        System.out.println(valorPix);
    }
}
