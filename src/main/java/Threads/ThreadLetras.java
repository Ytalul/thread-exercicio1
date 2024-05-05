package Threads;

public class ThreadLetras extends Thread {

    private Object[] lista ;

    public ThreadLetras(Object[] lista){
        this.lista = lista;
    }
    public void run(){

        System.out.print("As letras desta lista são: ");
        for( Object e : lista) {
            if (e instanceof String) {
                System.out.print(e);

            }
        }
    }
}
