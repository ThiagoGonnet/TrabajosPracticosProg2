package EJ1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
  // Atributos
  private String nombre = "N";
  private String apellido = "N";
  private int edad;
  private String fechaNac = "01/01/2000";
  final private int DNI;
  private char sexo = 'F';
  private double peso = 1;
  private double altura = 1;

  // Constructores
  public Persona(int DNI) {
    this.DNI = DNI;
  }

  public Persona(int DNI, String nombre) {
    this.DNI = DNI;
    this.nombre = nombre;
  }

  public Persona(int DNI, String nombre, String apellido) {
    this.DNI = DNI;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Persona(int DNI, String nombre, String apellido, String fechaNac) {
    this.DNI = DNI;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNac = fechaNac;
  }

  // Responsabilidades
  public double masaCorporal() {
    return peso / (altura * altura);
  }

  public boolean enForma() {
    double imc = masaCorporal();
    return imc >= 18.5 && imc <= 25;
  }

  // fechaNac = "01/01/2000";
  public boolean cumpleAños() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
    LocalDate fechaHoy = LocalDate.now();
    return fechaHoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth()
        && fechaHoy.getMonth() == fechaNacimiento.getMonth();
  }

  public boolean esMayor() {
    return edad >= 18;
  }

  public boolean puedeVotar() {
    return edad >= 16;
  }

  public boolean esCoherente() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
    int edadCalculada = Period.between(fechaNacimiento, LocalDate.now()).getYears();
    return edad == edadCalculada;
  }

  public String toString() {
    return "Nombre: " + nombre +
        " Apellido: " + apellido +
        " Edad: " + edad +
        " Fecha de nacimiento: " + fechaNac +
        " DNI: " + DNI +
        " Sexo: " + sexo +
        " Peso: " + peso +
        " Altura: " + altura;
  }

  // Setters (menos DNI)
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setFechaNac(String fechaNac) {
    this.fechaNac = fechaNac;
  }
}
/*
 * Implementar una clase llamada Persona con las siguientes características:
 * Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
 * Valores por defecto:
 * ● El DNI es un valor obligatorio, no posee valor por defecto.
 * ● En caso de la fecha de nacimiento será el 1 de enero de 2000.
 * ● Sexo será Femenino por defecto.
 * ● El nombre por defecto es N y el apellido es N.
 * ● El peso y la altura son 1 por defecto.
 * Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI
 * nombre y
 * apellido, con DNI nombre apellido y Fecha de nacimiento…..
 * La responsabilidad de la clase es la siguiente:
 * ● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su
 * índice
 * de masa corporal el cual es peso / altura2
 * ● Saber si está en forma. Está en forma si el índice de masa corporal se
 * encuentra
 * entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
 * ● Saber si está cumpliendo años.
 * ● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
 * años
 * ● Métodos set de cada parámetro, excepto de DNI.
 * ● Saber si puede votar. Es necesario ser mayor de 16 años.
 * ● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
 * ● Mostrar toda la información del objeto. Es decir devolver un String con la
 * información del mismo.
 */
