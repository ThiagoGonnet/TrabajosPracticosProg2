package TP5.EJ7;

public class EmpleadoBono extends EmpleadoComisionado{
    private double minimoVentasBono;
    private double valorBono = 1000; // valor de ejemplo

    public EmpleadoBono(String apellido, String DNI, String nombre, double sueldoMensual, double totalVentas, double minimoVentasBono, double valorBono) {
        super(apellido, DNI, nombre, sueldoMensual, totalVentas);
        this.minimoVentasBono = minimoVentasBono;
        this.valorBono = valorBono;
    }

    @Override
    public double getSueldoMensual(){
        if(super.getTotalVentas() >=minimoVentasBono){
            return sueldoMensual + valorBono;
        } else{
            return sueldoMensual;
        }
    }
}
// No seria necesario el parametro de porcentajeVenta, pero se rompe si no lo declaro ahi creo, y comparten atributos y metodos como para que no extienda de EmpleadoComision, pero bueno, capaz la solucion optima es que herede/extienda de Empleado, en este caso me parecio mejor que extienda de EmpleadoComision