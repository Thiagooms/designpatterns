package case2.strategy;

import java.util.List;

public class BancoDadosFonte implements FonteDados {

    @Override
    public List<String> coletar() {
        System.out.println("Executando query no banco de dados...");
        return List.of("registro1", "registro2", "registro3");
    }
}
