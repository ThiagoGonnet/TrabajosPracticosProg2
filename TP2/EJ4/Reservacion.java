package EJ4;

public class Reservacion {
  private String nombreUsuario;
  private String deporte;

    public Reservacion(String deporte, String nombreUsuario) {
        this.deporte = deporte;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
      return nombreUsuario;
    }

    public String getDeporte() {
      return deporte;
    }
}
