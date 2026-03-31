package case5;

public class ControllerUsuario {
    private ContadorDeRequisicoes contador = ContadorDeRequisicoes.getInstance();

    public void listarUsuarios() {
        contador.registrar("/usuarios");
    }
}
