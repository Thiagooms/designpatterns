package case2.factory;

public class Main {
    static void main(String[] args){

        PDFFactory factory = new PDFFactory();
        String resultado = factory.gerarRelatorio("teste");
        System.out.println(resultado);

    }
}
