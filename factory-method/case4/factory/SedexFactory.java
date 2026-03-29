package case4.factory;

import case4.Frete;
import case4.SedexFrete;

public class SedexFactory extends FreteFactory {

    @Override
    protected Frete criarFrete() {
        return new SedexFrete();
    }
}
