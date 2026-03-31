package case8.factory;

import case8.Emprestimo;

public abstract class EmprestimoFactory {

    public abstract Emprestimo criarEmprestimo();

    public void processarEmprestimo(double valor){
        Emprestimo emprestimo = criarEmprestimo();
        System.out.println("Calculo de Juros:   " + emprestimo.calcularJuros(valor));
        System.out.println("Calculo Total:  " + emprestimo.calcularTotal(valor));
System.out.println(emprestimo.registrarContrato());
    }
}
