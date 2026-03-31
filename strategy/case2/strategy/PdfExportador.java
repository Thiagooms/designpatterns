package case2.strategy;

import java.util.List;

public class PdfExportador implements ExportadorRelatorio {

    @Override
    public void exportar(List<String> dados) {
        System.out.println("Gerando PDF...");
        System.out.println("[PDF] " + dados);
    }
}
