package Clase_20_03.Ejercicio5;

public class Obrera extends Thread{
    private String resultado = "No calculado";
    public void run(){
        resultado = Calcula();
    }
    String Calcula(){
// Realiza un cálculo largo.
        try {Thread.sleep(10000);
        }catch(InterruptedException e){};
        return "Ya calculado";
    }
    public String getResultado(){
        return resultado;
    }

    public static void main(String[] args){
        Obrera agente = new Obrera();
        agente.start();
// Hace algo durante el cálculo.
        try { //Espera a que agente termine
            agente.join();
        }catch (InterruptedException e){};
// Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}
