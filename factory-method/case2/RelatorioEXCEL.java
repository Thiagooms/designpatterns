package case2;

public class RelatorioEXCEL implements Relatorio{

    @Override
    public String gerar(String dados) {
        return "Relatório de dados: " + dados;
    }
}
