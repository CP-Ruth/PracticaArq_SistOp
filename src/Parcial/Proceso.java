package Parcial;

public class Proceso {
    private String nombre;
    private int duracion;
    private int tiempoLlegada;


    //Constructor
    public Proceso(String nombre, int duracion, int tiempoLlegada) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tiempoLlegada = tiempoLlegada;
    }

    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }
}
