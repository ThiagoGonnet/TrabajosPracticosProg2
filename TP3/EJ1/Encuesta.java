package TP3.EJ1;

import java.util.ArrayList;

public class Encuesta {
    private static int contador = 0;
    private int ID;
    private String nombre;
    private String apellido;
    private String tipoFormulario;
    ArrayList<String> preguntas;
    Persona personaEncuestada;
    PersonaEmpleado empleadoEncuesta;


    public Encuesta(ArrayList<String> preguntas, Persona personaEncuestada, PersonaEmpleado empleadoEncuesta, String tipoFormulario) {
        this.preguntas = preguntas;
        this.personaEncuestada = personaEncuestada;
        this.empleadoEncuesta = empleadoEncuesta;
        this.tipoFormulario = tipoFormulario;
        this.ID = ++contador;
    }

    public String getTipoFormulario (){
        return tipoFormulario;
    }

    public Persona getPersonaEncuestada() {
        return personaEncuestada;
    }
    public PersonaEmpleado getEmpleadoEncuesta(){
        return empleadoEncuesta;
    }
    public int getFormularioID(){
        return ID;
    }

    @Override
    public String toString() {
        return "Encuesta " + ID + " (" + tipoFormulario + ") para " + personaEncuestada.getNombre();
    }

}
