package TP4.EJ5;

public class Producto {
    private String fechaVencimiento;
    private int numeroLote;
    private String granjaOrigen;
    private String fechaEnvasado;

    public Producto(String fechaEnvasado, String fechaVencimiento, String granjaOrigen, int numeroLote) {
        this.fechaEnvasado = fechaEnvasado;
        this.fechaVencimiento = fechaVencimiento;
        this.granjaOrigen = granjaOrigen;
        this.numeroLote = numeroLote;
    }

    public String getEtiqueta(){
        return "Fecha de Vencimiento" + fechaVencimiento + "\nNumero lote: + numeroLote" + "\nGranja origen: "+ granjaOrigen + " Fecha de envasado" + fechaEnvasado;
    }
}
