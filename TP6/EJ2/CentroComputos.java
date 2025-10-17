package centroComputos;

import java.util.ArrayList;

public class CentroComputos {
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public CentroComputos() {
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void agregarProceso(Proceso proceso){
        if (computadoras.estaVacio()){
           procesos.agregarOrdenado(proceso);
        }
        else {
            Computadora compu = (Computadora) computadoras.dameSiguiente();
            compu.asignoProceso(proceso);
        }
    }

    public void agregarComputadora(Computadora computadora){
        if (procesos.estaVacio()){
            computadoras.agregarOrdenado(computadora);
        }
        else {
            computadora.asignoProceso((Proceso) procesos.dameSiguiente());
        }
    }

    public void imprimirProcesosEnEspera(){
        procesos.imprimir();
    }

    public void imprimirComputadorasLibres(){
        computadoras.imprimir();
    }
}
