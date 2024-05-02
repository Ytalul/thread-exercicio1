package principal;
import Threads.ThreadLetras;
import Threads.ThreadNum;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object[] lista = {"a",1,"b",2,"c",3};

        ThreadLetras threadLetters = new ThreadLetras(lista);
        threadLetters.start();
        //Thread.sleep(1000);
        ThreadNum threadNumbers = new ThreadNum(lista);
        threadNumbers.start();

    }
}