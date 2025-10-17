package TP4.EJ4;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroPasaporte;
    private String fechaNacimiento;
    private boolean enPaisOrigen;
    private boolean concentrado;

    public Persona(String nombre, String apellido, String numeroPasaporte, String fechaNacimiento, boolean enPaisOrigen, boolean concentrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroPasaporte = numeroPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.enPaisOrigen = enPaisOrigen;
        this.concentrado = concentrado;
    }


    public boolean estaDisponible(){
        return enPaisOrigen && !concentrado;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Pasaporte: " + numeroPasaporte +
                " - Disponible: " + estaDisponible();
    }

}
