package TP4.EJ6;

import java.util.ArrayList;

public class RolJerarquico extends RolEmpleado{
    ArrayList<RolEmpleado> empleadosACargo;

    public RolJerarquico(String apellido, String cargo, int edad, String nombre, int numeroLegajo, double sueldo) {
        super(apellido, cargo, edad, nombre, numeroLegajo, sueldo);
        this.empleadosACargo= new ArrayList<>();
    }

    @Override
    public String toString(){
        String texto = super.toString();
        texto +="\nEmpleados a cargo.";
        for(RolEmpleado e:empleadosACargo){
            texto += "\n- " + e.getNombre() + " " + e.getApellido();
        }
        return texto;
    }
}
