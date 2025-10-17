package TP4.EJ4;

import java.util.ArrayList;

public class Contingente {
    private String nombre;
    private ArrayList<Persona> seleccion;

    public Contingente(String nombre) {
        this.nombre = nombre;
        this.seleccion = new ArrayList<>();
    }

    public void agregarPersona(Persona p){
        seleccion.add(p);
    }

    public void mostrarPersonas(){
        for(Persona p:seleccion){
            System.out.println(p.toString());
        }
    }
}
