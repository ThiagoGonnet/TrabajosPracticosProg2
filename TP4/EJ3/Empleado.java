package TP4.EJ3;

public class Empleado {
    private String nombre;
    private String DNI;
    private int cantidadHorasTrabajadas;

    public Empleado(int cantidadHorasTrabajadas, String DNI, String nombre) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public double calcularPago(){
        return cantidadHorasTrabajadas * 6000;
    };

    public int getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }
}
