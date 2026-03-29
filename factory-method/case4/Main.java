package case4;

import case4.factory.CorreiosFactory;
import case4.factory.LocalFactory;
import case4.factory.SedexFactory;

public class Main {
    public static void main(String[] args){

        CorreiosFactory factory = new CorreiosFactory();
        factory.criarFrete(50.0, "São Paulo");

        LocalFactory factory1 = new LocalFactory();
        factory1.criarFrete(150, "SP");

        SedexFactory factory2 = new SedexFactory();
        factory2.criarFrete(20, "US");
    }
}
