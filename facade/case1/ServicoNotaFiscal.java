package case1;

public class ServicoNotaFiscal {

    public void emitir(String cliente, String produto, double valor) {
        System.out.println("Nota Fiscal: emitida para " + cliente + " — " + produto + " R$" + valor);
    }
}
