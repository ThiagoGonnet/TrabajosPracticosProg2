package TP4.EJ6;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> registro;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.registro = new ArrayList<>();
    }

    public void agregarPersona(Persona p){
        registro.add(p);
    }

    public void exportarListado(){
        for(Persona p:registro){
            System.out.println(p.toString() + "\n");
        }
    }
}
