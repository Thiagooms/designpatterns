public class main{
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        if (log == log2) {
            System.out.println("Singleton funcionou!");
        } else {
            System.out.println("Deu merda!");
        }
    }
}
