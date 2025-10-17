package TP5.EJ8;


import java.util.ArrayList;

public class TrabajoPoster extends Trabajo{
    public TrabajoPoster() {
        super();
    }

    // usa metodo del padre para agregar palabras clave segun el trabajo q sea

    @Override
    public boolean esApto(Evaluador e){
        for(String p:getPalabrasClave()){
            if(e.getConocimiento().contains(p)){
                return true;
            }
        }
        return false;
    }

}
