package EJ3;

import java.util.ArrayList;

public class Provincia {
  private String nombre;
  ArrayList<Ciudad> ciudades;

  public Provincia(String nombre) {
    this.nombre = nombre;
    this.ciudades = new ArrayList<>();
  }

  public void agregarCiudad(Ciudad c) {
    ciudades.add(c);
  }

  public int ciudadesConDeficit() {
    int contador = 0;
    for (Ciudad c : ciudades) {
      if (c.getHabitantes() > 100000 && calcularDeficit(c)) {
        contador++;
      }
    }
  return contador;
  }

  public boolean calcularDeficit(Ciudad c) {
    return c.getGastosMantenimiento() > c.getRecaudacion();
  }
}
