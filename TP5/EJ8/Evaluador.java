package TP5.EJ8;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private ArrayList<String> conocimiento;
    private ArrayList<Trabajo> trabajosAsignados;

    public Evaluador(String nombre, ArrayList<String> conocimiento) {
        this.nombre = nombre;
        this.conocimiento = conocimiento;
        this.trabajosAsignados = new ArrayList<>();
    }

    public ArrayList<String> getConocimiento() {
        return new ArrayList<>(conocimiento); // Devuelve copia de lista de conocimientos que posee el evaluado
    }

    public ArrayList<Trabajo> getTrabajosAsignados() {
        return trabajosAsignados;
    }
}
