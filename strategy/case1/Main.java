package case1;

import case1.strategy.CsvFormatador;
import case1.strategy.EmailEntrega;
import case1.strategy.FtpEntrega;
import case1.strategy.XmlFormatador;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dados = List.of("  dado1  ", "dado2", "  dado3");

        ExportadorDeDados exportador = new ExportadorDeDados(new CsvFormatador(), new EmailEntrega());
        exportador.processarEEnviar(dados);

        System.out.println();

        ExportadorDeDados exportador2 = new ExportadorDeDados(new XmlFormatador(), new FtpEntrega());
        exportador2.processarEEnviar(dados);
    }
}
