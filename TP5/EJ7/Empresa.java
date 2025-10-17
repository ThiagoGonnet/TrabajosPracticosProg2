package TP5.EJ7;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }
    public double gastoTotalSueldos(){
        double suma = 0;
        for(Empleado e:empleados){
            suma += e.getSueldoMensual();
        }
        return suma;
    }

}
