package TP4.EJ6;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        // Crear empresa
        Empresa empresa = new Empresa("Tech Solutions S.A.");

        // Crear empleados
        RolEmpleado e1 = new RolEmpleado("Pérez", "Empleado", 30, "Juan", 1001, 50000.0);
        RolEmpleado e2 = new RolEmpleado("Gómez", "Empleado", 25, "Ana", 1002, 45000.0);
        RolEmpleado e3 = new RolEmpleado("López", "Empleado", 28, "Carlos", 1003, 47000.0);

        // Crear usuarios finales
        RolUsuarioFinal u1 = new RolUsuarioFinal("Martínez", "Usuario Final", 22, "Lucía", "lmartinez", "pass123");
        RolUsuarioFinal u2 = new RolUsuarioFinal("Fernández", "Usuario Final", 35, "Tomás", "tfernandez", "secure456");

        // Crear jerárquico con empleados a cargo
        ArrayList<RolEmpleado> empleadosACargo = new ArrayList<>();
        empleadosACargo.add(e1);
        empleadosACargo.add(e2);
        RolJerarquico j1 = new RolJerarquico("Ramírez", "Jerárquico", 40, "Marta", 2001, 80000.0);
        // Agregar los empleados a cargo
        j1.empleadosACargo.addAll(empleadosACargo);

        // Agregar todas las personas a la empresa
        empresa.agregarPersona(e1);
        empresa.agregarPersona(e2);
        empresa.agregarPersona(e3);
        empresa.agregarPersona(u1);
        empresa.agregarPersona(u2);
        empresa.agregarPersona(j1);

        // mostrar listado
        empresa.exportarListado();
    }
}
/*
6- Registro Empresa
Implementar en java el sistema de registro de una empresa. Este sistema de
registro permite exportar un String con el listado de todas las personas asociadas a
la empresa. En el String, en cada línea (usar ‘\n’ para concatenar los Strings) se
muestra el cargo de la persona, su nombre, apellido y edad. En el sistema existen
distintos tipos de roles: el empleado, del cual, además del nombre, apellido y edad,
se guarda el número de legajo y su sueldo; el usuario final, del cual se guarda el
nombre, apellido, edad, nombre de usuario y password; y el jerárquico, del cual se
registra su nombre, apellido, edad, número de legajo, sueldo y una lista de
empleados a cargo.
 */