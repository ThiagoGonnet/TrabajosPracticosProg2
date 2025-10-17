package TP4.EJ3;

public class EmpleadoHorasExtras extends Empleado{
    private double montoFijoSemanal;
    private final static double montoExtra = 300;

    public EmpleadoHorasExtras(int cantidadHorasTrabajadas, String DNI, String nombre, double montoFijoSemanal) {
        super(cantidadHorasTrabajadas, DNI, nombre);
        this.montoFijoSemanal = montoFijoSemanal;
    }

    @Override
    public double calcularPago(){
        return montoFijoSemanal + (double) (montoExtra * getCantidadHorasTrabajadas());
    }
}
