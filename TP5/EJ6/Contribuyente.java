package TP5.EJ6;

public abstract class Contribuyente {
    private String nombre;
    private String identificacionTributaria;
    private double montoFijo

    public Contribuyente(String identificacionTributaria, String nombre, double montoFijo) {
        this.identificacionTributaria = identificacionTributaria;
        this.nombre = nombre;
        this.montoFijo = montoFijo
    }

    public String getIdentificacionTributaria() {
        return identificacionTributaria;
    }
    public abstract double calcularImpuesto();

    public abstract double getMontoFijo() {
        return montoFijo;
    }
    public String getIdentificacionTributaria(){
        return identificacionTributaria;
    }
}
