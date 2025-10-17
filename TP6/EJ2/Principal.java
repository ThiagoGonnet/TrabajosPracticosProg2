
public class Principal {
    public static void main(String[] args) {
        CentroComputos centroComputos = new CentroComputos();
        centroComputos.agregarProceso(new Proceso("Proc1", 100, 10));
        centroComputos.agregarProceso(new Proceso("Proc2", 200, 10));
        //centroComputos.agregarProceso(new Proceso("Proc3", 50, 10));
        //centroComputos.agregarProceso(new Proceso("Proc4", 150, 10));

        System.out.println("Procesos en espera:");
        centroComputos.imprimirProcesosEnEspera();
        System.out.println("Computadoras libres:");
        centroComputos.imprimirComputadorasLibres();

        System.out.println("\nAgregando computadora...");
        centroComputos.agregarComputadora(new Computadora(6, "Comp1",  "Sala 1", 200));
        System.out.println("\nAgregando computadora...");
        centroComputos.agregarComputadora(new Computadora(1, "Comp2",  "Sala 1", 200));
        centroComputos.agregarComputadora(new Computadora(2, "Comp3",  "Sala 1", 400));
        centroComputos.agregarComputadora(new Computadora(3,  "Comp4", "Sala 1", 100));
        centroComputos.agregarComputadora(new Computadora(4, "Comp4",  "Sala 1", 200));

        System.out.println("Procesos en espera:");
        centroComputos.imprimirProcesosEnEspera();
        System.out.println("Computadoras libres:");
        centroComputos.imprimirComputadorasLibres();
    }
}
