package EJ4;

import java.util.ArrayList;

public class EstablecimientoDeportivo {
  ArrayList<Reservacion> reservaciones;
  ArrayList<Socio> socios;
  final double precioFutbol = 400;
  final double precioPaddle = 100;
  final double descuento = 10.0;
  private double precio;

    public EstablecimientoDeportivo() {
      this.reservaciones = new ArrayList<>();
      this.socios = new ArrayList<>();
    }

  public void addReservacion(Reservacion r) {
    if (esSocio(r.getNombreUsuario())) {
      aplicarDescuento(r.getDeporte());
      System.out.println("El precio es: " + precio);
      reservaciones.add(r);
    } else {
      reservaciones.add(r);
    }
  }

  public double aplicarDescuento(String deporte) {
    if (deporte.equals("Futbol")) {
      precio = precioFutbol - (precioFutbol * (descuento / 100));
    }
    if (deporte.equals("Paddle")) {
      precio = precioPaddle - (precioPaddle * (descuento / 100));
    }
    return precio;
  }

  public boolean esSocio(String nombreUsuario) {
    for (Socio s : socios) {
      if (s.getNombre().equals(nombreUsuario)) {
        return true;
      }
    }
      int contador = 0;
        for (Reservacion r : reservaciones) {
          if (r.getNombreUsuario().equals(nombreUsuario)) {
            contador++;
          }
          if (contador >= 4) {
            socios.add(new Socio(nombreUsuario));
            return true;
          }
        }
        return false;
      }

  }
