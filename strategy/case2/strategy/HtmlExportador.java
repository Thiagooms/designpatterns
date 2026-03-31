package case2.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlExportador implements ExportadorRelatorio {

    @Override
    public void exportar(List<String> dados) {
        System.out.println("Gerando página HTML...");
        System.out.println("<ul>" + dados.stream()
                .map(d -> "<li>" + d + "</li>")
                .collect(Collectors.joining()) + "</ul>");
    }
}
