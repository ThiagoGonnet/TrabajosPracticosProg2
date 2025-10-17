package TP5.EJ4;

import java.util.ArrayList;

public abstract class Casa {
    private ArrayList<Cualidad> cualidades;
    protected ArrayList<Alumno> alumnos;
    private int capacidadMaxima;
    private String nombreCasa;

    public Casa(int capacidadMaxima, String nombreCasa) {
        this.capacidadMaxima = capacidadMaxima;
        this.cualidades = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.nombreCasa = nombreCasa;
    }

    public void agregarCualidad(Cualidad c){
        cualidades.add(c);
    }

    public boolean estaLlena() {
        return alumnos.size() >= capacidadMaxima;
    }

    protected abstract boolean condicionesExtra(Alumno a);

    public boolean agregarAlumno(Alumno a) {
        if (!estaLlena() && cumpleCualidades(a) && condicionesExtra(a)) {
            alumnos.add(a);
            return true;
        }
        return false;
    }

    public boolean cumpleCualidades(Alumno a){
        return a.getCualidadesAlumno().containsAll(cualidades);
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<>(alumnos);
    }
    public String getNombreCasa(){
        return nombreCasa;
    }
}
