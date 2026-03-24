public class Ingresso {
    public String n;
    public double v;
    public int t; // 1 = normal, 2 = estudante, 3 = idoso, 4 = vip
    public String s; // manha, tarde, noite

    public Ingresso(String n, double v, int t, String s) {
        this.n = n;
        this.v = v;
        this.t = t;
        this.s = s;
    }
}