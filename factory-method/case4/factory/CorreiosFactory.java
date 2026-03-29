package case4.factory;

import case4.CorreiosFrete;
import case4.Frete;

public class CorreiosFactory extends FreteFactory{

    @Override
    protected Frete criarFrete() {
        return new CorreiosFrete();
    }
}
