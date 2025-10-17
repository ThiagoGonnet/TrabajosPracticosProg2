package TP5.EJ4;

import java.util.ArrayList;

public class Slytherin extends Casa{
    private ArrayList<Casa> casasEnemigas;

    public Slytherin(int capacidadMaxima,  String nombreCasa) {
        super(capacidadMaxima, nombreCasa);
        this.casasEnemigas = new ArrayList<>();
    }

    public void agregarCasaEnemiga(Casa c) {
        if (!casasEnemigas.contains(c)) {
            casasEnemigas.add(c);
        }
    }

    @Override
    protected boolean condicionesExtra(Alumno a) {
        for (Casa enemiga : casasEnemigas) {
            if (enemiga.getAlumnos().contains(a)) {
                return false;
            }
        }
        return true;
    }

}
