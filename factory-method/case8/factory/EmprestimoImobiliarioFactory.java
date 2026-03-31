package case8.factory;

import case8.Emprestimo;
import case8.EmprestimoImobiliario;

public class EmprestimoImobiliarioFactory extends EmprestimoFactory {

    @Override
    public Emprestimo criarEmprestimo() {
        return new EmprestimoImobiliario();
    }

}
