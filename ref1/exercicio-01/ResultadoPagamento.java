public class ResultadoPagamento {
    private boolean sucesso;
    private String descricao;
    private double totalCobrado;

    public ResultadoPagamento(boolean sucesso, String descricao, double totalCobrado) {
        this.sucesso = sucesso;
        this.descricao = descricao;
        this.totalCobrado = totalCobrado;
    }

    public boolean isSucesso() { return sucesso; }
    public String getDescricao() { return descricao; }
    public double getTotalCobrado() { return totalCobrado; }

    @Override
    public String toString() {
        return String.format("[%s] %s", sucesso ? "OK" : "ERRO", descricao);
    }
}
