package TP6.EJ3;

import java.time.LocalDate;

public class Barco {
    private String nombre;
    private int capacidad;

    public Barco(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }
}
