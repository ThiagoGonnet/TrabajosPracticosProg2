package TP4.EJ2;

public class Sensor {
    private String zona;
    private boolean seRompioVidrio;
    private boolean seAbrioPuertaOVentana;
    private boolean seDetectoMovimiento;

    public Sensor(boolean seAbrioPuertaOVentana, boolean seDetectoMovimiento, boolean seRompioVidrio, String zona) {
        this.seAbrioPuertaOVentana = seAbrioPuertaOVentana;
        this.seDetectoMovimiento = seDetectoMovimiento;
        this.seRompioVidrio = seRompioVidrio;
        this.zona = zona;
    }

    public boolean comprobar(){
        if(seRompioVidrio || seAbrioPuertaOVentana || seDetectoMovimiento){
            return true;
        } else {
            return false;
        }
    }
    public String getZona(){
        return zona;
    }
}
