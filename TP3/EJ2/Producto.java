package TP3.EJ2;

public class Producto {
    final static double PORCENTAJE_VENTA = 0.35;

    private double peso;
    private double costoFabricacion;
    private double valorVenta;
    private String tipoMadera;
    private String color;

    public Producto(double peso, double costoFabricacion, double valorVenta, String tipoMadera, String color) {
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.valorVenta = costoFabricacion + ((costoFabricacion * PORCENTAJE_VENTA));
        this.tipoMadera = tipoMadera;
        this.color = color;
    }

    public void setCostoFabricacion(double costo){
        if(costo>0){
            this.costoFabricacion = costo;
        } else {
            mostrarError();
        }
    }

    public void mostrarError(){
        System.out.println("El valor tiene que ser mayor a 0!");
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }
}
