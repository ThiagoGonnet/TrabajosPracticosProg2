package TP3.EJ3;

public class Caracteristica {
    private int visionNocturna; // 0 a 100
    private int velocidad;      // 0 a 100
    private int fuerza;         // 0 a 100
    private int edad;           // 0 a 100
    private int peso;           // >=0
    private double altura;      // >=0

    public Caracteristica(int edad, double altura, int peso, int fuerza, int velocidad, int visionNocturna) {
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
        setFuerza(fuerza);
        setVelocidad(velocidad);
        setVisionNocturna(visionNocturna);
    }

    public void setVisionNocturna(int visionNocturna) {
        if (visionNocturna >= 0 && visionNocturna <= 100) {
            this.visionNocturna = visionNocturna;
        } else {
            mostrarError("Vision Nocturna (0-100)");
        }
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0 && velocidad <= 100) {
            this.velocidad = velocidad;
        } else {
            mostrarError("Velocidad (0-100)");
        }
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 0 && fuerza <= 100) {
            this.fuerza = fuerza;
        } else {
            mostrarError("Fuerza (0-100)");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad <= 100) {
            this.edad = edad;
        } else {
            mostrarError("Edad (1-100)");
        }
    }

    public void setPeso(int peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            mostrarError("Peso (>0)");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            mostrarError("Altura (>0)");
        }
    }

    private void mostrarError(String atributo) {
        System.out.println("Valor inválido para " + atributo);
    }

    // Getters
    public int getVisionNocturna() { return visionNocturna; }
    public int getVelocidad() { return velocidad; }
    public int getFuerza() { return fuerza; }
    public int getEdad() { return edad; }
    public int getPeso() { return peso; }
    public double getAltura() { return altura; }
}
