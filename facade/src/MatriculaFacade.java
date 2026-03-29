public class MatriculaFacade {

    private ServicoFinanceiro servicoFinanceiro;
    private ServicoCurso servicoCurso;
    private ServicoMatricula servicoMatricula;
    private ServicoEmailMatricula servicoEmailMatricula;

    public MatriculaFacade(ServicoFinanceiro servicoFinanceiro, ServicoCurso servicoCurso,
                           ServicoMatricula servicoMatricula, ServicoEmailMatricula servicoEmailMatricula) {
        this.servicoFinanceiro = new ServicoFinanceiro();
        this.servicoCurso = new ServicoCurso();
        this.servicoMatricula = new ServicoMatricula();
        this.servicoEmailMatricula = new ServicoEmailMatricula();
    }

    public MatriculaFacade(String thiago, String ciênciasDaComputação) {
    }

    public MatriculaFacade matricularAluno(String aluno, String curso){
        if(!servicoFinanceiro.verificarPendencias(aluno)){
            if(servicoCurso.verificarVagas(curso)) {
                servicoMatricula.registrar(aluno, curso);
                servicoEmailMatricula.enviarConfirmacao(aluno, curso);
                System.out.println("Matrícula concluída");
            }

            throw new IllegalArgumentException("O curso não possui mais vagas");
        }

        throw new IllegalArgumentException("O Aluno possui pendências");
    }
}
