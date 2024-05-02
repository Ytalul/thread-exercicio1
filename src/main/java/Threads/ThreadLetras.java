package Threads;

public class ThreadLetras extends Thread {
    private Object[] lista ;
    private Object[] novaLista = new Object[3];

    public ThreadLetras(Object[] lista){
        this.lista = lista;
    }
    public void run(){
        int i=0;
        System.out.print("As letras desta lista são: ");
        for( Object e : lista) {
            if (e instanceof String) {
                novaLista[i] = e;
                i++;
                System.out.print(e);
            }
        }
    }
}
