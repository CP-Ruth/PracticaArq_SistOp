package Clase_20_03.Ejercicio2;

public class PingPong implements Runnable  {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras
    public PingPong(String queDecir, int cadaCuantosMs){
        word = queDecir; delay = cadaCuantosMs; };
    public void run(){
        while(true){
            System.out.print(word + " ");
            try{
                Thread.sleep(delay);
            }catch(InterruptedException e){return;}
        }
    }
    public static void main(String[] args){
// Los objetos r1 y r2 definen la funcionalidad.
// (definen los métodos run())
        PingPong r1 = new PingPong("PING",33);
        PingPong r2= new PingPong("PONG",10);
// Se crean los threads
        Thread t1 = new Thread(r1);
        Thread t2= new Thread(r2);
// Se activan los threads
        t1.start();
        t2.start();
    }
}