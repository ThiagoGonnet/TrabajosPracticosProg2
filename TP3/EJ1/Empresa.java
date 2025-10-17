package TP3.EJ1;

import java.util.ArrayList;

public class Empresa {
    private String nombreEmpresa;
    ArrayList<Encuesta> encuestas;

    public Empresa(String nombreEmpresa) {
        encuestas = new ArrayList<>();
        this.nombreEmpresa = nombreEmpresa;
    }

    public void agregarEncuesta(Encuesta e) {
        if (encuestaContestadaAnteriormente(e)) {
            System.out.println("La persona ya contesto esta encuesta anteriormente!");
        } else {
            encuestas.add(e);
            System.out.println("Encuesta agregada correctamente: ID " + e.getFormularioID());
        }
    }

    public boolean encuestaContestadaAnteriormente(Encuesta nueva){
        for(Encuesta e:encuestas){
            boolean mismaPersona = e.getPersonaEncuestada().equals(nueva.getPersonaEncuestada());
            boolean mismoFormulario = e.getTipoFormulario().equals(nueva.getTipoFormulario());
            if(mismaPersona && mismoFormulario){
                return true;
            }
        }
        return false;
    }

    public int contarEncuestasPorEmpleado(PersonaEmpleado emp) {
        int count = 0;
        for(Encuesta e : encuestas){
            if(e.getEmpleadoEncuesta().equals(emp)){
                count++;
            }
        }
        return count;
    }

    public void mostrarEncuestas(){
        for(Encuesta e:encuestas){
            System.out.println(e);
        }
    }
}
