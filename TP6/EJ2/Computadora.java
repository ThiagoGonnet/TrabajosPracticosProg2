package centroComputos;

import java.io.Serializable;

public class Computadora extends Inventariable implements ObjetoComparable {
    private String nombre;
    private double velocidadCPU;
    private Proceso procesoEnEjecucion;

    public Computadora(int inventario, String nombre, String sala, double velocidadCPU) {
        super(inventario, sala);
        this.nombre = nombre;
        this.velocidadCPU = velocidadCPU;
        this.procesoEnEjecucion = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public String toString() {
        return nombre + " ("+this.velocidadCPU+" MHz)";
    }

    public void asignoProceso(Proceso proceso) {
        this.procesoEnEjecucion = proceso;
    }

    public void liberarProceso(){
        procesoEnEjecucion = null;
    }

    public Proceso getProceso() {
        return procesoEnEjecucion;
    }

    @Override
    public boolean esMayor(ObjetoComparable otro) {
        return this.getVelocidadCPU() > ((Computadora)otro).getVelocidadCPU();
    }
}
