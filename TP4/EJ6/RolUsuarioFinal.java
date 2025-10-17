package TP4.EJ6;

public class RolUsuarioFinal extends Persona{
    private String nombreUsuario;
    private String password;

    public RolUsuarioFinal(String apellido, String cargo, int edad, String nombre, String nombreUsuario, String password) {
        super(apellido, cargo, edad, nombre);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nNombre Usuario: " + nombreUsuario +
                "\nContraseña: " + password;
    }
}
