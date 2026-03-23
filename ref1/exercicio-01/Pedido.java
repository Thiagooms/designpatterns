public class Pedido {
    private String id;
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Pedido(String id, String produto, int quantidade, double precoUnitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getTotal() {
        return quantidade * precoUnitario;
    }

    public String getId() { return id; }
    public String getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }
}
