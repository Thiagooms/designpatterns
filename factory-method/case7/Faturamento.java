package case7;

public interface Faturamento {
    public double processarFaturamento(double valor);
    public double calcularTributo(double valor);
    public String registrarEmBanco();
}
