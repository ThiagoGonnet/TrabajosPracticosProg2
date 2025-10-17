package TP4.EJ2;

import java.util.ArrayList;


public class Alarma {
    private ArrayList<Sensor> sensores;

    public Alarma() {
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor s){
        sensores.add(s);
    }

    public void comprobarAlarma() {
        for (Sensor s : sensores) {
            if (s.comprobar()) {
                Timbre.hacerSonar();
                System.out.println("Se activó la alarma en la zona: " + s.getZona());
            }
        }
    }

}
