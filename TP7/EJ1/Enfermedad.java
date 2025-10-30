package TP7.EJ1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<Enfermedad> estadosPatologicosATratar;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        this.estadosPatologicosATratar = new ArrayList<>();
    }

}
