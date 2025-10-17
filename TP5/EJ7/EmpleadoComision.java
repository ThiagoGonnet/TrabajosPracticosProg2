package TP5.EJ7;

public class EmpleadoComision extends EmpleadoComisionado{
    private double porcentajeVenta;

    public EmpleadoComision(String apellido, String DNI, String nombre, double sueldoMensual, double totalVentas, double porcentajeVenta) {
        super(apellido, DNI, nombre, sueldoMensual, totalVentas);
        this.porcentajeVenta = porcentajeVenta;
    }

    @Override
    public double calcularComision(){
        return super.getTotalVentas() * porcentajeVenta;
    };

    @Override
    public double getSueldoMensual(){
        return sueldoMensual + this.calcularComision();
    }
}
