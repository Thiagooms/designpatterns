package case4;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCache {

    private static GerenciadorDeCache instance;
    private Map<String, String> cache = new HashMap<>();

    private GerenciadorDeCache() {}

    public static GerenciadorDeCache getInstance() {
        if (instance == null) {
            synchronized (GerenciadorDeCache.class) {
                if (instance == null) {
                    instance = new GerenciadorDeCache();
                }
            }
        }
        return instance;
    }

    public void adicionar(String chave, String valor) {
        cache.put(chave, valor);
        System.out.println("Cache gravado: " + chave + " = " + valor);
    }

    public String buscar(String chave) {
        return cache.getOrDefault(chave, "NÃO ENCONTRADO");
    }

    public int tamanho() {
        return cache.size();
    }
}
