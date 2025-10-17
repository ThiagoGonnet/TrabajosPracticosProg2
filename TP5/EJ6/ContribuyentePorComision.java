package TP5.EJ6;

public class ContribuyentePorComision extends Contribuyente{
    private double porcentajeMonto;
    private double montoVentas;
    private double porcentajePorVenta;
    public ContribuyenteComerciante(String identificacionTributaria, String nombre, double montoFijo, double montoVentas, double porcentajeMonto, double porcentajePorVenta) {
        super(identificacionTributaria, nombre, montoFijo);
        this.montoVentas = montoVentas;
        this.porcentajeMonto = porcentajeMonto;
        this.porcentajePorVenta = porcentajePorVenta;
    }
    @Override
    public double calcularMonto(){
        return (super.getMontoFijo() * porcentajeMonto) + (montoVentas * porcentajePorVenta);
    }
}
}
