package TP5.EJ4;

import java.util.ArrayList;

public class Gryffindor extends Casa {
    private ArrayList<Casa> casasEnemigas;

    public Gryffindor(int capacidadMaxima, String nombreCasa) {
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
        // Debe tener algún familiar ya en la casa (linaje)
        for (Persona f : a.getFamiliaresEnEscuela()) {
            if (alumnos.contains(f)) {
                return true;
            }
        }
        // Si no tiene familiares, se acepta igual
        return a.getFamiliaresEnEscuela().isEmpty();
    }
}
