package TP4.EJ1;

public class Principal {
    public static void main(String[] args) {

        // Alarma básica
        Alarma alarmaNormal = new Alarma(true, false, false); // se abrió una puerta
        System.out.println("Probando alarma normal:");
        boolean activada = alarmaNormal.comprobar();
        System.out.println("Alarma activada: " + activada);
        System.out.println("----------------------------");

        // Alarma luminosa
        AlarmaLuminosa alarmaLuz = new AlarmaLuminosa(false, true, false); // se detectó movimiento
        System.out.println("Probando alarma luminosa:");
        boolean activadaLuz = alarmaLuz.comprobar();
        System.out.println("Alarma luminosa activada: " + activadaLuz);
    }
}

/*
1 - Alarma
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
sonora.
Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender().
 */