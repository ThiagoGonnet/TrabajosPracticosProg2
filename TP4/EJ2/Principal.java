package TP4.EJ2;

public class Principal {
    public static void main(String[] args){
        // Crear la alarma
        Alarma alarma = new Alarma();

        // Crear sensores
        Sensor sensorSala = new Sensor(false, true, false, "Sala");         // Detecta movimiento
        Sensor sensorCocina = new Sensor(true, false, false, "Cocina");     // Detecta puerta abierta
        Sensor sensorDormitorio = new Sensor(false, false, true, "Dormitorio"); // Detecta vidrio roto

        // Agregar sensores a la alarma
        alarma.agregarSensor(sensorSala);
        alarma.agregarSensor(sensorCocina);
        alarma.agregarSensor(sensorDormitorio);

        // Comprobar la alarma
        alarma.comprobarAlarma();
    }
}
/*
2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
pantalla el nombre de la zona en conflicto  (pueden ser más de una).
 */
