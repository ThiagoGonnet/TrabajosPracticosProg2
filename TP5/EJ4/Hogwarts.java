package TP5.EJ4;

import java.util.ArrayList;


public class Hogwarts {
    private ArrayList<Casa> casas;

    public Hogwarts() {
        this.casas = new ArrayList<>();
    }
    public void agregarCasa(Casa c){
        casas.add(c);
    }

    public void agregarAlumno(Alumno a){
        for(Casa c:casas){
            if(c.agregarAlumno(a)){
                System.out.println(a.getNombre() + " fue asignado a la casa " + c.getNombreCasa());
                break;
            }
        }
    }

}
