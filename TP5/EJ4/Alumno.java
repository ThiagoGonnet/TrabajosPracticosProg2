package TP5.EJ4;

import java.util.ArrayList;


public class Alumno extends Persona{
    private ArrayList<Cualidad> cualidadesAlumno;
    private ArrayList<Persona> familiaresEnEscuela;

    public Alumno(String nombre) {
        super(nombre);
        this.cualidadesAlumno = new ArrayList<>();
        this.familiaresEnEscuela = new ArrayList<>();
    }
    public void agregarFamiliar(Persona f){
        familiaresEnEscuela.add(f);
    }

    public void agregarCualidad(Cualidad c) {
        if(cualidadesAlumno == null) {
            cualidadesAlumno = new ArrayList<>();
        }
        cualidadesAlumno.add(c);
    }

    public ArrayList<Cualidad> getCualidadesAlumno() {
        return new ArrayList<>(cualidadesAlumno);
    }
    public ArrayList<Persona> getFamiliaresEnEscuela(){
        return new ArrayList<>(familiaresEnEscuela);
    }

}
