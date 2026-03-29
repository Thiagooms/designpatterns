package case4.factory;

import case4.Frete;
import case4.LocalFrete;

public class LocalFactory extends FreteFactory {

    @Override
    protected Frete criarFrete() {
        return new LocalFrete();
    }
}
