package TP4.EJ4;

public class Entrenador extends Persona{
    private String identificadorFederacion;

    public Entrenador(String nombre, String apellido, String numeroPasaporte, String fechaNacimiento,
                      boolean enPaisOrigen, boolean concentrado, String identificadorFederacion) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento, enPaisOrigen, concentrado);
        this.identificadorFederacion = identificadorFederacion;
    }
}
