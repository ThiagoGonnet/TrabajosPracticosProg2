package TP4.EJ5;

public class ProductoCongeladoAire extends ProductoCongelado{
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoAire(String fechaEnvasado, String fechaVencimiento, String granjaOrigen, int numeroLote, String codigoOrganismoSupervisionAlimentaria, double temperaturaMantenimientoRecomendada, double porcentajeDioxidoCarbono, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeVaporAgua) {
        super(fechaEnvasado, fechaVencimiento, granjaOrigen, numeroLote, codigoOrganismoSupervisionAlimentaria, temperaturaMantenimientoRecomendada);
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public String getEtiqueta(){
        return "\n Porcentaje nitrogeno: %" + porcentajeNitrogeno +
                "\n Porcentaje oxigeno: %" + porcentajeOxigeno +
                "\n Porcentaje dioxido de carbono: %" + porcentajeDioxidoCarbono +
                "\n Porcentaje vapor de agua: %" + porcentajeVaporAgua;
    }
}
