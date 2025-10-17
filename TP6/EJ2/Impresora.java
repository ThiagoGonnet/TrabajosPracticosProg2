package centroComputos;

public class Impresora extends Inventariable{
    private String marca;
    private boolean color;

    public Impresora(int nroInventario, String sala, String marca, boolean color) {
        super(nroInventario, sala);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
