public class Reserva {
    public Sessao s;
    public String cli;

    public Reserva(String nomeCliente) {
        this.cli = nomeCliente;
        this.s = new Sessao();
    }

    public void confirmar() {
        if (cli.equals("")) {
            System.out.println("Erro: Cliente nao informado");
            return;
        }

        double t = s.processar();

        if (t > 300) {
            System.out.println("Reserva premium para: " + cli);
        }
    }
}