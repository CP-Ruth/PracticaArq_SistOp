package Parcial;

import java.util.ArrayList;

public class Cargador {
    private ArrayList<Proceso> colaProcesos;

    //Constructor
    public Cargador() {
        this.colaProcesos = new ArrayList<>();
    }

    //Getter and setter


    public ArrayList<Proceso> getColaProcesos() {
        return colaProcesos;
    }

    public void setColaProcesos(ArrayList<Proceso> colaProcesos) {
        this.colaProcesos = colaProcesos;
    }

    //Method
    public void add(Proceso proceso){
        colaProcesos.add(proceso);
    }

    public void printCola()
    {
        System.out.println("Proceso - Duracion - Tiempo de llegada");
        for (Proceso proceso : colaProcesos) {
            System.out.println(proceso.getNombre()+"  "+proceso.getDuracion()+"  "+proceso.getTiempoLlegada());
        }
    }
}
