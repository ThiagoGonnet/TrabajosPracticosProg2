package TP6.EJ3;

import java.time.LocalDate;

public class Camion {
    private String nombre;
    private LocalDate fechaCargado;

    public Camion(LocalDate fechaCargado, String nombre) {
        this.fechaCargado = fechaCargado;
        this.nombre = nombre;
    }

    public LocalDate getFechaCargado() {
        return fechaCargado;
    }

    public String getNombre() {
        return nombre;
    }
}
