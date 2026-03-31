package case2;

import case2.strategy.ApiRestFonte;
import case2.strategy.BancoDadosFonte;
import case2.strategy.CsvFonte;
import case2.strategy.ExcelExportador;
import case2.strategy.HtmlExportador;
import case2.strategy.PdfExportador;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== API + PDF ===");
        new GeradorDeRelatorio(new PdfExportador(), new ApiRestFonte()).gerarEExportar();

        System.out.println("\n=== CSV + EXCEL ===");
        new GeradorDeRelatorio(new ExcelExportador(), new CsvFonte()).gerarEExportar();

        System.out.println("\n=== BANCO + HTML ===");
        new GeradorDeRelatorio(new HtmlExportador(), new BancoDadosFonte()).gerarEExportar();
    }
}
