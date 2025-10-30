package TP7.EJ1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public boolean esDeUtilidad(ProductoQuimico p){
        return false;
    }
}
