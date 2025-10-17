package TP4.EJ4;

public class Futbolista extends Persona{
    private String posicion;
    private char piernaHabil;
    private int cantidadGoles;

    public Futbolista(String nombre, String apellido, String numeroPasaporte, String fechaNacimiento, boolean enPaisOrigen, boolean concentrado, String posicion, char piernaHabil,int cantidadGoles) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento, enPaisOrigen, concentrado);
        this.cantidadGoles = cantidadGoles;
        this.piernaHabil = piernaHabil;
        this.posicion = posicion;
    }
}
