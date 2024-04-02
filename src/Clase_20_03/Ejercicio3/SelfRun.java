package Clase_20_03.Ejercicio3;

public class SelfRun implements Runnable {
    private Thread internalThread;
    private boolean noStopRequired;

    public SelfRun() {
        System.out.println("Comienza ejecución");
        noStopRequired = true;
        internalThread = new Thread(this);
        internalThread.start();
    }

    public void run() {
        while (noStopRequired) {
            System.out.println("En ejecución");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopRequest() {
        noStopRequired = false;
        internalThread.interrupt();
    }

    public static void main(String[] args) {
        SelfRun objActivo=new SelfRun();
// Espera durante 2 segundos
        try{Thread.sleep(2000);
        }catch(InterruptedException e){};
// Termina el objeto activo
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest();
    }
}