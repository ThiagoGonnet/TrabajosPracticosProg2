package TP5.EJ8;

import java.util.ArrayList;

public abstract class Trabajo {
    private ArrayList<String> palabrasClave;

    public Trabajo() {
        this.palabrasClave = new ArrayList<>();
    }

    public void agregarPalabrasClave(String palabra){
        palabrasClave.add(palabra);
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }
    public boolean esApto(Evaluador e){
        for(String p:palabrasClave){
            if(!e.getConocimiento().contains(p)){
                return false;
            }
        }
        return true;
    }
}
