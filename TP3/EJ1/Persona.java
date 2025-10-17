package TP3.EJ1;

public class Persona {
    private String nombre;
    private String rol;
    private String dni;

    public Persona(String nombre, String rol, String dni) {
        this.nombre = nombre;
        this.rol = rol;
        this.dni = dni;
    }

    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
}
