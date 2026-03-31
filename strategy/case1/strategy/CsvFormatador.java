package case1.strategy;

import java.util.List;

public class CsvFormatador implements FormatadorDados {

    @Override
    public String formatar(List<String> dados) {
        return String.join(",", dados);
    }
}
