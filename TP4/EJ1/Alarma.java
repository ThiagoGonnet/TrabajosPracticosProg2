package TP4.EJ1;



public class Alarma {
    protected boolean seRompioVidrio;
    protected boolean seAbrioPuertaOVentana;
    protected boolean seDetectoMovimiento;

    public Alarma(boolean seAbrioPuertaOVentana, boolean seDetectoMovimiento, boolean seRompioVidrio) {
        this.seAbrioPuertaOVentana = seAbrioPuertaOVentana;
        this.seDetectoMovimiento = seDetectoMovimiento;
        this.seRompioVidrio = seRompioVidrio;
    }

    public boolean comprobar(){
        if(seRompioVidrio || seAbrioPuertaOVentana || seDetectoMovimiento){
            // Timbre.hacerSonar();
            return true;
        } else {
            return false;
        }
    }
}
