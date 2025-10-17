package TP5.EJ5;

public class Mineral {
    private String nombre;

    public Mineral(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mineral mineral = (Mineral) o;
        return nombre.equalsIgnoreCase(mineral.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}