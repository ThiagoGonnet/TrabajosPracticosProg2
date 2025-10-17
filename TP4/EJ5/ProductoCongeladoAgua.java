package TP4.EJ5;

public class ProductoCongeladoAgua extends ProductoCongelado{
    private double salinidadAgua;

    public ProductoCongeladoAgua(String fechaEnvasado, String fechaVencimiento, String granjaOrigen, int numeroLote, String codigoOrganismoSupervisionAlimentaria, double temperaturaMantenimientoRecomendada, double salinidadAgua) {
        super(fechaEnvasado, fechaVencimiento, granjaOrigen, numeroLote, codigoOrganismoSupervisionAlimentaria, temperaturaMantenimientoRecomendada);
        this.salinidadAgua = salinidadAgua;
    }
    @Override
    public String getEtiqueta(){
        return "\n Salinidad del agua: " + salinidadAgua;
    }
}
