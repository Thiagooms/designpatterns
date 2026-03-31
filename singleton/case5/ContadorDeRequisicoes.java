package case5;

import java.util.HashMap;
import java.util.Map;

public class ContadorDeRequisicoes {

    private static ContadorDeRequisicoes instance;
    private Map<String, Integer> contagens = new HashMap<>();

    private ContadorDeRequisicoes() {}

    public static ContadorDeRequisicoes getInstance(){
        if (instance == null){
            synchronized (ContadorDeRequisicoes.class){
                if (instance == null){
                    instance = new ContadorDeRequisicoes();
                }
            }
        }
        return instance;
    }

    public void registrar(String rota) {
        contagens.merge(rota, 1, Integer::sum);
        System.out.println("Requisição registrada: " + rota);
    }

    public int total() {
        return contagens.values().stream().mapToInt(Integer::intValue).sum();
    }

    public void relatorio() {
        contagens.forEach((rota, qtd) ->
                System.out.println(rota + ": " + qtd + " requisições")
        );
    }
}
