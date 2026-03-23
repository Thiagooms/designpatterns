public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if(instance == null) {
            synchronized (Logger.class){
                instance = new Logger();
            }
        }

        return instance;
    }
}
