package TP5.EJ8;

import java.util.ArrayList;

public class CongresoSistema {
    private ArrayList<String> temasGenerales;
    private ArrayList<String> temasEspecificos;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajosDisponibles;
    private String nombreCongreso;

    public CongresoSistema(String nombreCongreso) {
        this.evaluadores = new ArrayList<>();
        this.nombreCongreso = nombreCongreso;
        this.temasGenerales = new ArrayList<>();
        this.temasEspecificos = new ArrayList<>();
        this.trabajosDisponibles = new ArrayList<>();
    }

    public void agregarTrabajo(Trabajo t){
        trabajosDisponibles.add(t);
    }
    public void agregarTemaGeneral(String tg){
        temasGenerales.add(tg);
    }
    public void agregartemasEspecificos(String te){
        temasEspecificos.add(te);
    }
    public void agregarEvaluador(Evaluador e){
        evaluadores.add(e);
    }

    //4) determinar si un evaluador dado es general o experto. Si da false es General

    public boolean esExperto(Evaluador e){
        for(String t:temasEspecificos){
            if(!e.getConocimiento().contains(t)){
                return false;
            }
        }
        return true;
    }

    // 1) qué evaluador puede asignarse a un determinado trabajo,
    public ArrayList<Evaluador> queEvaluadorAsignarATrabajo(Trabajo t) {
        ArrayList<Evaluador> evaluadoresAptos = new ArrayList<>();
        for (Evaluador e : evaluadores) {
            if (t.esApto(e)) {
                evaluadoresAptos.add(e);
            }
        }
        return evaluadoresAptos;
    }

    // 3) cuántos trabajos tiene un evaluador determinado
    public int cantidadTrabajos(Evaluador e){
        return e.getTrabajosAsignados().size();
    }


    //2) qué trabajos pueden asignarse un evaluador particular
    public ArrayList<Trabajo> trabajosAsignadosPosibles(Evaluador e){
        ArrayList<Trabajo> trabajosPosibles = new ArrayList<>();
                for(Trabajo t:trabajosDisponibles){
                    if(t.esApto(e)){
                        trabajosPosibles.add(t);
                    }
                }
                return trabajosPosibles;
    }
}

