package case4;

import case4.strategy.BoletoPagamento;
import case4.strategy.CartaoCreditoPagamento;
import case4.strategy.DescontoVIP;

public class Main {
    public static void main(String[] args){
        ProcessadorDePagamento processadorDePagamento = new ProcessadorDePagamento(new DescontoVIP(), new CartaoCreditoPagamento());
        processadorDePagamento.processar(5000);
    }
}
