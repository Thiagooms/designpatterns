package case5;

public class Pix implements Pagamento{

    @Override
    public double processar(double valor) {
        return valor;
    }
}
