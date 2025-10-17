package TP4.EJ5;

public class ProductoCongelado extends Producto{
    private String codigoOrganismoSupervisionAlimentaria;
    private double temperaturaMantenimientoRecomendada;

    public ProductoCongelado(String fechaEnvasado, String fechaVencimiento, String granjaOrigen, int numeroLote, String codigoOrganismoSupervisionAlimentaria, double temperaturaMantenimientoRecomendada) {
        super(fechaEnvasado, fechaVencimiento, granjaOrigen, numeroLote);
        this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    @Override
    public String getEtiqueta(){
        return "\n Codigo de Organismo de Supervision Alimentaria: " + codigoOrganismoSupervisionAlimentaria + "\nTemperatura de mantenimiento recomendada: " + temperaturaMantenimientoRecomendada;
    }
}
