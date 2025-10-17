package TP4.EJ4;

public class Masajista extends Persona{
    private String titulo;
    private int añosExperiencia;

    public Masajista(String nombre, String apellido, String numeroPasaporte, String fechaNacimiento,
                     boolean enPaisOrigen, boolean concentrado, String titulo, int añosExperiencia) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento, enPaisOrigen, concentrado);
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }
}
