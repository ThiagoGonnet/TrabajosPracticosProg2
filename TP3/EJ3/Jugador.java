package TP3.EJ3;

import java.util.ArrayList;


public class Jugador {
    private String nombreReal;
    private String nombreSuperHeroe;
    private ArrayList<Caracteristica> caracteristicas;

    public Jugador(String nombreReal, String nombreSuperHeroe, ArrayList<Caracteristica> caracteristicas) {
        this.nombreReal = nombreReal;
        this.nombreSuperHeroe = nombreSuperHeroe;
        this.caracteristicas = caracteristicas;
    }

    public ArrayList<Caracteristica> getCaracteristicas(){
        return new ArrayList<>(caracteristicas); // Devuelve una copia de la lista asi desde fuera n ose puede modificar y hacer trampa
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }
}
