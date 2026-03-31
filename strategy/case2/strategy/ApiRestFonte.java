package case2.strategy;

import java.util.List;

public class ApiRestFonte implements FonteDados {

    @Override
    public List<String> coletar() {
        System.out.println("Conectando à API REST...");
        return List.of("vendas", "estoque", "clientes");
    }
}
