package TP6.EJ1;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<ElementoAlquilable> itemsAlquilados;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.itemsAlquilados = new ArrayList<>();
    }

    public void agregarElemento(ElementoAlquilable e){
        itemsAlquilados.add(e);
    }

    public boolean tieneAlquileresVencidos(){
        for (ElementoAlquilable e : itemsAlquilados) {
            if (e.estaVencido()) {
                return true;
            }
        }
        return false;
    }
    public String getNombre() {
        return nombre;
    }
}
