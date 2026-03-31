package case2.strategy;

import java.util.List;

public class CsvFonte implements FonteDados{

    @Override
    public List<String> coletar() {
        System.out.println("Lendo arquivo CSV...");
        return List.of("linha1", "linha2", "linha3");
    }
}
