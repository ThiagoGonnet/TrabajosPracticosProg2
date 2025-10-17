package TP4.EJ1;

public class AlarmaLuminosa extends Alarma{
    public AlarmaLuminosa(boolean seAbrioPuertaOVentana, boolean seDetectoMovimiento, boolean seRompioVidrio){
        super(seAbrioPuertaOVentana, seDetectoMovimiento, seRompioVidrio);
    }

    @Override
    public boolean comprobar() {
        boolean activada = super.comprobar(); // hace sonar el timbre
        if(activada) {
            // Luz.encender();
        }
        return activada;
    }

}
