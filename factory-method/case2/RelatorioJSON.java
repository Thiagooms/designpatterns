package case2;

public class RelatorioJSON implements Relatorio{

    @Override
    public String gerar(String dados) {
        return "Relatório de dados: " + dados;
    }
}
