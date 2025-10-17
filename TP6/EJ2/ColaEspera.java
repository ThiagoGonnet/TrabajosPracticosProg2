package centroComputos;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ObjetoComparable> elementos;

    public ColaEspera() {
        this.elementos = new ArrayList<>();
    }

    public boolean estaVacio() {
        return elementos.isEmpty();
    }

    public void agregarOrdenado(ObjetoComparable elementoNuevo) {
        int i = 0;
        while (i<elementos.size() && elementos.get(i).esMayor(elementoNuevo))
            i++;
        elementos.add(i, elementoNuevo);
    }

    public Object dameSiguiente() {
        return elementos.remove(0);
    }

    public void imprimir() {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
