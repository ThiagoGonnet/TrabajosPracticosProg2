package centroComputos;

public class Inventariable {
    private int nroInventario;
    private String sala;

    public Inventariable(int nroInventario, String sala) {
        this.nroInventario = nroInventario;
        this.sala = sala;
    }

    public int getNroInventario() {
        return nroInventario;
    }

    public void setNroInventario(int nroInventario) {
        this.nroInventario = nroInventario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
