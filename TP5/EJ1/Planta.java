package TP5.EJ1;

import java.time.LocalDate;

public class Planta {
  // el static hace que pertenezca a la clase y no a los objetos
  private static int contador = 0;

  private String nombreCientifico;
  private String nombreComun;
  private String paisOrigen;
  private LocalDate fechaDeCompra;
  private int ID;

  public Planta(String nombreCientifico, String nombreComun, String paisOrigen) {
    this.ID = ++contador;
    this.fechaDeCompra = LocalDate.now();
    this.nombreCientifico = nombreCientifico;
    this.nombreComun = nombreComun;
    this.paisOrigen = paisOrigen;
  }

    public int getID() {
        return ID;
    }
}
