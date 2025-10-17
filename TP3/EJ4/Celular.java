package TP3.EJ4;
import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;

    public Celular(){
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto c){
        contactos.add(c);
    }

    public void mostrarTotalContactos(){
        System.out.println("El total de contactos es: " + contactos.size());
    }
    public void listarContactosRepetidos(){
        System.out.println("Contactos Repetidos:");
        for(Contacto c: contactos){
            if(esRepetido(c)){
                System.out.println(c.toString());
            }
        }
    }

    public double promedioEdadContactos(){
        if(contactos.size() != 0){
            double total = 0;
            for(Contacto c:contactos){
                total += c.getEdad();
            }
            return total / (double) contactos.size();
        } else {
            return 0.0;
        }

    }

    public ArrayList<Contacto> contactosMismoNumeroTelefono(String numeroTelefono){
        ArrayList<Contacto> contactosMismoNumeroTelefono= new ArrayList<>();

        for(Contacto c: contactos){
            if(numeroTelefono.equals(c.getTelefono())){
                contactosMismoNumeroTelefono.add(c);
            }
        }
        return new ArrayList<>(contactosMismoNumeroTelefono); // Devuelve copia para no romper encapsulamiento
    }
    public boolean esRepetido(Contacto c){
        for(Contacto elemento:contactos){
            if(elemento!=c){
                if(c.getNombre().equals(elemento.getNombre()) && c.getApellido().equals(elemento.getApellido()) && c.getTelefono().equals(elemento.getTelefono())){
                    return true;
                }
            }
        }
            return false;
    }

}

