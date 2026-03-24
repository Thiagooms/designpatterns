package case2;

public class RelatorioPDF implements Relatorio{

    @Override
    public String gerar(String dados) {
        return "Relatório de dados: " + dados;
    }
}
