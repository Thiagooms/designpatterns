package case3;

import case3.factory.EmailFactory;

public class Main {
    public static void main(String[] args){
        EmailFactory factory = new EmailFactory();
        factory.notificar("teste@gmail.com", "email teste para teste");


    }
}
