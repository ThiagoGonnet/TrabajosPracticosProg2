package EJ2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
  private String lugar;
  private ArrayList<Persona> participantes;
  private String temaATratar;
  private int duracion;
  private LocalDateTime fecha;

  public Reunion(String lugar, ArrayList<Persona> participantes, String temaATratar, int duracion) {
    this.participantes = participantes;
    this.lugar = lugar;
    this.temaATratar = temaATratar;
    this.duracion = duracion;
    this.fecha = LocalDateTime.now();
  }

  public LocalDateTime getFecha() {
    return fecha;
  }
}
