package case1;

public class ServicoEstoque {

    public boolean verificarDisponibilidade(String produto, int quantidade) {
        System.out.println("Estoque: verificando " + quantidade + "x " + produto);
        return true;
    }

    public void reservar(String produto, int quantidade) {
        System.out.println("Estoque: reservando " + quantidade + "x " + produto);
    }
}
