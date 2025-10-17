package TP6.EJ1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    private String nombre;
    private ArrayList<ElementoAlquilable> elementosAlquilados;

    public Videoclub(String nombre){
        this.nombre = nombre;
        this.elementosAlquilados = new ArrayList<>();
    }

    public void alquilar(ElementoAlquilable e, Cliente cliente) {
        if (e.sePuedeAlquilar()) {
            e.alquilar(cliente);              // delega al objeto concreto
            elementosAlquilados.add(e);       // guarda en el registro global
        }
    }
}
