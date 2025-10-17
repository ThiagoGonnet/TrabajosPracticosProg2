package TP3.EJ1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Creamos la empresa
        Empresa empresa = new Empresa("MiEmpresa");

        // Preguntas
        ArrayList<String> preguntas = new ArrayList<>();
        preguntas.add("¿Cómo calificas el servicio?");
        preguntas.add("¿Volverías a usarlo?");

        ArrayList<String> preguntasOtra = new ArrayList<>();
        preguntasOtra.add("¿Estás satisfecho con la atención?");
        preguntasOtra.add("¿Recomendarías el servicio?");

        ArrayList<String> preguntasDiferentes = new ArrayList<>();
        preguntasDiferentes.add("¿Te gustó el producto?");
        preguntasDiferentes.add("¿Comprarías nuevamente?");

        // Persona y empleado
        Persona p = new Persona("Ana", "Gómez", "12345678");
        PersonaEmpleado emp = new PersonaEmpleado("Luis", "encuestador", "99999999");

        // Encuestas
        Encuesta e1 = new Encuesta(preguntas, p, emp, "Satisfacción del servicio");
        System.out.println("Intentando agregar e1...");
        empresa.agregarEncuesta(e1); // → OK

        Encuesta e2 = new Encuesta(preguntasOtra, p, emp, "Satisfacción del servicio");
        System.out.println("Intentando agregar e2...");
        empresa.agregarEncuesta(e2); // → Error esperado (misma persona y mismo tipoFormulario)

        Encuesta e3 = new Encuesta(preguntasDiferentes, p, emp, "Opinión del producto");
        System.out.println("Intentando agregar e3...");
        empresa.agregarEncuesta(e3); // → OK (diferente tipoFormulario)

        // Mostrar todas las encuestas agregadas
        System.out.println("\n📋 Encuestas registradas:");
        empresa.mostrarEncuestas();
    }
}


/*
  1  Sistema de encuestas
Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su
mecanismo de encuestas. La compañía se encarga de realizar encuestas para empresas
de terceros o para el gobierno. Una encuesta se compone de un conjunto de preguntas,
una persona encuestada y el empleado que realizo la encuesta.  La compañía guarda
todas las encuestas realizadas. Los empleados cobran un plus por cantidad de encuestas
realizadas, con lo cual la empresa desea conocer el número de encuestas que realizó
cada empleado. Para evitar falsificación de datos, en la encuesta figura el número de
documento de la persona. Una misma persona no puede llenar dos veces la misma
encuesta, pero si una encuesta diferente.
Consejo: Diferenciar entre formulario a responder y formulario respondido.
Extra: ¿Qué cambiaría el eliminar la restricción de solo una encuesta por persona?
*/
