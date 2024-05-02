package Threads;

public class ThreadNum extends Thread{
    private Object[] lista;
    private int[] novaLista = new int[3];

    public ThreadNum(Object[] lista){
            this.lista = lista;
    }

    public void run(){
        byte i = 0;
        System.out.print(" Os numeros dessa lista são: ");
        for( Object e : lista ){
            Class<?> tipo = e.getClass();
            if (tipo.getName().equals("java.lang.Integer")){
                novaLista[i] = (int) e;
                i ++;
                System.out.print(e);
            }
        }
    }
}
