package TP5.EJ7;

public abstract class EmpleadoComisionado extends Empleado{
    private double totalVentas;

    public EmpleadoComisionado(String apellido, String DNI, String nombre, double sueldoMensual, double totalVentas) {
        super(apellido, DNI, nombre, sueldoMensual);
        this.totalVentas = totalVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }
}
