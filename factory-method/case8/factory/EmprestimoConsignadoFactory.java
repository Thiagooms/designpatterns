package case8.factory;

import case8.Emprestimo;
import case8.EmprestimoConsignado;

public class EmprestimoConsignadoFactory extends EmprestimoFactory {

    @Override
    public Emprestimo criarEmprestimo() {
        return new EmprestimoConsignado();
    }
}
