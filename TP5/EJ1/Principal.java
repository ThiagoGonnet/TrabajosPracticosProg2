package TP5.EJ1;

public class Principal{
  public static void main(String[] args){
    Planta p1 = new Planta("Vaporious", "Girasol", "Alemania");
    Planta p2 = new Planta("Derek", "Meto", "Polonia");

    System.out.println(p1.getID());
    System.out.println(p2.getID());
  }
}
