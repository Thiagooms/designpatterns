public class ProcessadorPagamento {
    private String metodoPagamento;
    private int parcelas;

    public ProcessadorPagamento(String metodoPagamento, int parcelas) {
        this.metodoPagamento = metodoPagamento;
        this.parcelas = parcelas;
    }

    public ResultadoPagamento pagar(Pedido pedido) {
        double total = pedido.getTotal();

        if (metodoPagamento.equals("cartao_credito")) {
            double taxa = 0.0;
            if (parcelas > 1) {
                taxa = total * 0.0199 * parcelas;
            }
            double totalComTaxa = total + taxa;
            double valorParcela = totalComTaxa / parcelas;

            String descricao = String.format(
                "Cartão de crédito: %dx de R$%.2f (total R$%.2f, taxa R$%.2f)",
                parcelas, valorParcela, totalComTaxa, taxa
            );
            return new ResultadoPagamento(true, descricao, totalComTaxa);

        } else if (metodoPagamento.equals("boleto")) {
            double taxa = 3.50;
            double totalComTaxa = total + taxa;
            String codigoBarras = gerarCodigoBarras(pedido.getId(), totalComTaxa);

            String descricao = String.format(
                "Boleto gerado: R$%.2f (+ R$%.2f de taxa). Código: %s. Vence em 3 dias úteis.",
                total, taxa, codigoBarras
            );
            return new ResultadoPagamento(true, descricao, totalComTaxa);

        } else if (metodoPagamento.equals("pix")) {
            String chavePix = gerarChavePix(pedido.getId());

            String descricao = String.format(
                "PIX gerado: R$%.2f (sem taxa). Chave: %s. Válido por 30 minutos.",
                total, chavePix
            );
            return new ResultadoPagamento(true, descricao, total);

        } else {
            return new ResultadoPagamento(false, "Método de pagamento inválido: " + metodoPagamento, 0);
        }
    }

    private String gerarCodigoBarras(String pedidoId, double valor) {
        return String.format("34191%s%08.0f", pedidoId.replace("-", ""), valor * 100);
    }

    private String gerarChavePix(String pedidoId) {
        return "pix-" + pedidoId + "-" + System.currentTimeMillis() % 10000;
    }
}
