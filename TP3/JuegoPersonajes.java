package TP3.EJ3;

public class JuegoPersonajes {
    private static int numeroPartida;
    private int contador = 0;

    public JuegoPersonajes(){
        this.numeroPartida = ++contador;
    }

    public void Jugar(Jugador p1, Jugador p2){
        Caracteristica c1 = p1.getCaracteristicas().get(0);
        Caracteristica c2 = p2.getCaracteristicas().get(0);

        quienGana(p1,p2,c1,c2);
    }

    public void quienGana(Jugador p1, Jugador p2, Caracteristica c1, Caracteristica c2){
        if(c1.getFuerza()>c2.getFuerza()){
            System.out.println("Gano " + p1.getNombreSuperHeroe());
        } else if (c1.getFuerza() < c2.getFuerza()) {
            System.out.println("Gano " + p2.getNombreSuperHeroe());
        } else {
            // DESEMPATE POR VELOCIDAD
            if(c1.getVelocidad() > c2.getVelocidad()){
                System.out.println("Gano " + p1.getNombreSuperHeroe());
            } else if(c2.getVelocidad() > c1.getVelocidad()){
                System.out.println("Gano " + p2.getNombreSuperHeroe());
            } else {
                System.out.println(p1.getNombreSuperHeroe() + " y " + p2.getNombreSuperHeroe() + " empataron!");
            }
        }
    }

}
