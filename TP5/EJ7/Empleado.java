package TP5.EJ7;

public class Empleado {
    private String nombre;
    private String apellido;
    private String DNI;
    private double sueldoMensual;

    public Empleado(String apellido, String DNI, String nombre, double sueldoMensual) {
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldoMensual = sueldoMensual;
    }

    public abstract double calcularComision();

    public double getSueldoMensual(){
        return sueldoMensual;
    }
}
