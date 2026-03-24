import java.util.ArrayList;
import java.util.List;

public class Sessao {
    public List<Ingresso> i = new ArrayList<>();
    public String status = "aberta";

    public void add(Ingresso ing) {
        if (status.equals("aberta")) {
            i.add(ing);
        }
    }

    public double processar() {
        double total = 0;
        String recibo = "";

        for (Ingresso ing : i) {
            double preco = ing.v;

            if (ing.t == 1) {
                preco = ing.v;
            } else if (ing.t == 2) {
                preco = ing.v * 0.50;
            } else if (ing.t == 3) {
                preco = ing.v * 0.50;
            } else if (ing.t == 4) {
                preco = ing.v * 1.30;
            }

            if (ing.s.equals("manha")) {
                preco = preco * 0.80;
            }

            total += preco;
            recibo += ing.n + " [" + ing.s + "] : R$ " + preco + "\n";
        }

        if (i.size() >= 5) {
            total = total * 0.95;
        }

        System.out.println("===== RECIBO =====");
        System.out.println(recibo);
        System.out.println("TOTAL: R$ " + total);

        status = "encerrada";
        return total;
    }
}