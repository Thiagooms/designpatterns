package case1;

public class PedidoFacade {

    private ServicoEstoque estoque;
    private ServicoPagamento pagamento;
    private ServicoNotaFiscal notaFiscal;
    private ServicoEmail email;

    public PedidoFacade() {
        this.estoque = new ServicoEstoque();
        this.pagamento = new ServicoPagamento();
        this.notaFiscal = new ServicoNotaFiscal();
        this.email = new ServicoEmail();
    }

    public void realizarPedido(String cliente, String produto, int quantidade, double valor) {
        if (estoque.verificarDisponibilidade(produto, quantidade)) {
            if (pagamento.processar(cliente, valor)) {
                estoque.reservar(produto, quantidade);
                notaFiscal.emitir(cliente, produto, valor);
                email.enviarConfirmacao(cliente, produto);
                System.out.println("Pedido concluído com sucesso.");
            }
        }
    }
}
