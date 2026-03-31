package case8.factory;

import case8.Emprestimo;
import case8.EmprestimoPessoal;

public class EmprestimoPessoalFactory extends EmprestimoFactory {

    @Override
    public Emprestimo criarEmprestimo() {
        return new EmprestimoPessoal();
    }
}
