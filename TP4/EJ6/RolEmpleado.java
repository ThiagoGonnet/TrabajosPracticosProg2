package TP4.EJ6;

public class RolEmpleado extends Persona{
    private int numeroLegajo;
    private double sueldo;

    public RolEmpleado(String apellido, String cargo, int edad, String nombre, int numeroLegajo, double sueldo) {
        super(apellido, cargo, edad, nombre);
        this.numeroLegajo = numeroLegajo;
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
        return super.toString() + // llama al toString() de Persona
                "\nNumero de legajo: " + numeroLegajo +
                "\nSueldo: $" + sueldo;
    }
}
