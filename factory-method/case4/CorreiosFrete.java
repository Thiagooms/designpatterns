package case4;

import java.util.Map;

public class CorreiosFrete implements Frete {

    private static final double TAXA_POR_KG = 5.00;
    private static final double TAXA_POR_KM = 0.10;

    private static final Map<String, Double> DISTANCIAS = Map.of(
            "SP", 10.0,
            "RJ", 430.0,
            "MG", 580.0,
            "BA", 1500.0
    );

    @Override
    public double calcular(double peso, String destino) {
        double distancia = DISTANCIAS.getOrDefault(destino, 1000.0);
        return (TAXA_POR_KG * peso) + (TAXA_POR_KM * distancia);
    }
}
