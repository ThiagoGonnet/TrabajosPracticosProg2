package TP4.EJ6;

public class Persona {
    private String cargo;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String apellido, String cargo, int edad, String nombre) {
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\n Edad: " + edad +
                "\n Cargo: " + cargo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}
