package case6;

public class Main {
    public static void main(String[] args){

        CalculadoraDeImposto calc = new CalculadoraDeImposto(new ImpostoRendaFixa());
        calc.calcular(20000);
    }
}
