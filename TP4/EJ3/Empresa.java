package TP4.EJ3;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
    }

}
