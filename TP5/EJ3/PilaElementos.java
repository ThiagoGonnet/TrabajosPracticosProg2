package TP5.EJ3;

import java.util.Stack;
import java.util.Collections;

public class PilaElementos {
    private Stack<Object> pila;

    public PilaElementos() {
        this.pila = new Stack<>();
    }

    // Agrega un elemento a la pila
    public void agregarElemento(Object o) {
        pila.push(o);
    }

    // Retira y retorna el último elemento agregado
    public Object retirarElemento() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null; // si la pila está vacía
    }

    // Consulta el tope sin eliminarlo
    public Object consultarTope() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        return null; // si la pila está vacía
    }

    // Retorna la cantidad de elementos
    public int cantidadElementos() {
        return pila.size();
    }

    // Retorna una copia de la pila en el mismo orden
    public Stack<Object> copiaPila() {
        return (Stack<Object>) pila.clone();
    }

    // Retorna una copia de la pila en orden inverso
    public Stack<Object> copiaInversaPila() {
        Stack<Object> copia = (Stack<Object>) pila.clone();
        Collections.reverse(copia);
        return copia;
    }
}


/*
mplementar en Java una pila de elementos. A una pila se le pueden agregar elementos
utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método
pop(), que retorna el último elemento agregado y lo elimina de la misma. Es posible
consultar el tope de la pila sin eliminarlo utilizando el método top(). La mencionada
anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, no se
pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila. Definir
también los siguientes métodos:
● size(): retorna la cantidad de elementos almacenados
● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
el mismo orden. La pila original debe mantener el orden de los elementos.
● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso.
 */
