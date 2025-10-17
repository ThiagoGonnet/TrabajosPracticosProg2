package TP4.EJ5;

public class ProductoCongeladoNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private int tiempoExposicionSegundos;

    public ProductoCongeladoNitrogeno(String fechaEnvasado, String fechaVencimiento, String granjaOrigen, int numeroLote, String codigoOrganismoSupervisionAlimentaria, double temperaturaMantenimientoRecomendada, String metodoCongelacion, int tiempoExposicionSegundos) {
        super(fechaEnvasado, fechaVencimiento, granjaOrigen, numeroLote, codigoOrganismoSupervisionAlimentaria, temperaturaMantenimientoRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionSegundos = tiempoExposicionSegundos;
    }

    public String getEtiqueta(){
        return "\n Método de congelación: " + metodoCongelacion +
                "\n Tiempo de exposicion en segundos: " + tiempoExposicionSegundos + "'";

    }
}
