package TP3.EJ4;

public class Contacto {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String telefono;
    private String domicilio;
    private String mail;
    private int edad;

    public Contacto(String nombre, String apellido, String domicilio, int edad, String fechaNacimiento, String mail, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    @Override
    public String toString(){
        return "\nNombre:" + nombre + "\nApellido: " + apellido + "\nNumero de Telefono: " + telefono + "\nEdad:" + edad;
    }
}
