package case2.strategy;

import java.util.List;

public class ExcelExportador implements ExportadorRelatorio {

    @Override
    public void exportar(List<String> dados) {
        System.out.println("Gerando planilha Excel...");
        System.out.println("[EXCEL] " + String.join(";", dados));
    }
}
