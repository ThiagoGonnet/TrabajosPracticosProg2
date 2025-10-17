package TP4.EJ3;

public class EmpleadoContratados extends Empleado{
    private double salarioFijoSemanal;

    public EmpleadoContratados(int cantidadHorasTrabajadas, String DNI, String nombre, double salarioFijoSemanal) {
        super(cantidadHorasTrabajadas, DNI, nombre);
        this.salarioFijoSemanal = salarioFijoSemanal;
    }

    @Override
    public double calcularPago(){
        return salarioFijoSemanal;
    }
}
