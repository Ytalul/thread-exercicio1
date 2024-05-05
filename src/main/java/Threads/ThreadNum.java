package Threads;

public class ThreadNum extends Thread{
    private Object[] lista;

    public ThreadNum(Object[] lista){
            this.lista = lista;
    }

    public void run(){
        System.out.print("\nOs numeros dessa lista são: ");

        for( Object e : lista ){
            Class<?> tipo = e.getClass();
            if (tipo.getName().equals("java.lang.Integer")){
                System.out.print(e);
            }
        }
    }
}
