package TP3.EJ1;

public class PersonaEmpleado extends Persona{
    private int cantidadEncuestas;
    public PersonaEmpleado(String nombre, String rol, String dni) {
        super(nombre, rol, dni);
        this.cantidadEncuestas = 0;
    }

    public void setCantidadEncuestas(int cantidadEncuestas) {
        this.cantidadEncuestas = cantidadEncuestas;
    }
    public int getCantidadEncuestas() {
        return cantidadEncuestas;
    }
}
