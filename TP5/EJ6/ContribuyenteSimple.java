package TP5.EJ6;

public class ContribuyenteSimple extends Contribuyente{
    public ContribuyenteSimple(String identificacionTributaria, String nombre, double montoFijo) {
        super(identificacionTributaria, nombre, montoFijo);
    }
    @Override
    public double calcularMonto(){
        return super.getMontoFijo();
    }
}
