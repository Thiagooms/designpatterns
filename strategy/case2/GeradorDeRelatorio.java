package case2;

import case2.strategy.ExportadorRelatorio;
import case2.strategy.FonteDados;

import java.util.List;

public class GeradorDeRelatorio {

    private final ExportadorRelatorio exportadorRelatorio;
    private final FonteDados fonteDados;

    public GeradorDeRelatorio(ExportadorRelatorio exportadorRelatorio, FonteDados fonteDados){
        this.exportadorRelatorio = exportadorRelatorio;
        this.fonteDados = fonteDados;
    }

    public void gerarEExportar() {
        List<String> dados = fonteDados.coletar();

        List<String> dadosProcessados = dados.stream()
                .map(String::toUpperCase)
                .toList();

        exportadorRelatorio.exportar(dadosProcessados);
    }

}
