package TP5.EJ5;

import java.util.ArrayList;

public abstract class Cereal {
    private String nombre;
    private ArrayList<Mineral> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineral(Mineral m) {
        mineralesRequeridos.add(m);
    }

    public ArrayList<Mineral> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    public abstract boolean esPastura();

    public String getNombre() {
        return nombre;
    }
}

