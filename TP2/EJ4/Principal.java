package EJ4;

public class Principal {
    public static void main(String[] args) {
        // Crear el establecimiento
        EstablecimientoDeportivo est = new EstablecimientoDeportivo();

        // Crear algunas reservaciones
        Reservacion r1 = new Reservacion("Futbol", "Juan");
        Reservacion r2 = new Reservacion("Paddle", "Juan");
        Reservacion r3 = new Reservacion("Futbol", "Juan");
        Reservacion r4 = new Reservacion("Paddle", "Juan");
        Reservacion r5 = new Reservacion("Futbol", "Maria");

        // Agregar reservaciones y mostrar si aplica descuento
        est.addReservacion(r1); // Juan no es socio todavía
        est.addReservacion(r2); // Juan no es socio todavía
        est.addReservacion(r3); // Juan no es socio todavía
        est.addReservacion(r4); // Ahora Juan debería volverse socio

        // La próxima reservación de Juan debería tener descuento
        Reservacion r6 = new Reservacion("Futbol", "Juan");
        est.addReservacion(r6);

        // Reservación de Maria, no tiene descuento
        est.addReservacion(r5);

        // Probar esSocio
        System.out.println("Juan es socio? " + est.esSocio("Juan")); // true
        System.out.println("Maria es socio? " + est.esSocio("Maria")); // false
    }
}
