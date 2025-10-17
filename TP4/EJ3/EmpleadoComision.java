package TP4.EJ3;

public class EmpleadoComision extends Empleado{
    private final static double PORCENTAJE = 10;
    private int cantidadVentas;
    private double sueldoFijo;

    public EmpleadoComision(int cantidadHorasTrabajadas, String DNI, String nombre, double sueldoFijo, int cantidadVentas) {
        super(cantidadHorasTrabajadas, DNI, nombre);
        this.sueldoFijo = sueldoFijo;
        this.cantidadVentas = cantidadVentas;
    }

    @Override
    public double calcularPago(){
        return sueldoFijo + (cantidadVentas * PORCENTAJE);
    }
}
