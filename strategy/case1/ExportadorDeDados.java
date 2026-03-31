package case1;

import case1.strategy.EntregaDados;
import case1.strategy.FormatadorDados;

import java.util.List;

public class ExportadorDeDados {

    private final FormatadorDados formatador;
    private final EntregaDados entrega;

    public ExportadorDeDados(FormatadorDados formatador, EntregaDados entrega) {
        this.formatador = formatador;
        this.entrega = entrega;
    }

    public void processarEEnviar(List<String> dados) {
        List<String> dadosLimpos = dados.stream()
                .map(String::trim)
                .map(String::toUpperCase)
                .toList();

        String payload = formatador.formatar(dadosLimpos);
        entrega.entregar(payload);
    }
}
