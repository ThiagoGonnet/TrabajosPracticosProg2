package TP5.EJ3;

import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        PilaElementos pila = new PilaElementos();

        // 1️⃣ Agregar elementos
        pila.agregarElemento("Hola");
        pila.agregarElemento(42);
        pila.agregarElemento(3.14);
        pila.agregarElemento(true);

        System.out.println("Cantidad de elementos: " + pila.cantidadElementos());
        System.out.println("Tope de la pila: " + pila.consultarTope());

        // 2️⃣ Retirar elementos
        System.out.println("Elemento retirado: " + pila.retirarElemento());
        System.out.println("Nuevo tope: " + pila.consultarTope());
        System.out.println("Cantidad de elementos: " + pila.cantidadElementos());

        // 3️⃣ Copia de la pila
        Stack<Object> copia = pila.copiaPila();
        System.out.println("Copia de la pila:");
        for (Object obj : copia) {
            System.out.println(obj);
        }

        // 4️⃣ Copia inversa
        Stack<Object> inversa = pila.copiaInversaPila();
        System.out.println("Copia inversa de la pila:");
        for (Object obj : inversa) {
            System.out.println(obj);
        }

        // 5️⃣ Retirar todos los elementos para verificar que original se mantiene
        while (pila.cantidadElementos() > 0) {
            System.out.println("Retirando: " + pila.retirarElemento());
        }
        System.out.println("Cantidad final de elementos en la pila: " + pila.cantidadElementos());
    }
}
