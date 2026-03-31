package case5;

import case5.strategy.DestinoConsole;
import case5.strategy.FormatoJSON;

public class Main {
    public static void main(String[] args){
        SistemaDeLog sistemalog = new SistemaDeLog(new FormatoJSON(), new DestinoConsole());
        sistemalog.registrar("2", "Teste");
    }
}
