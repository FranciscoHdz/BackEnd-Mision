package Semana2;

import java.security.PublicKey;

abstract class Hola{
    void saludar(){
        //Cómo lo hace
        System.out.println("¿Cómo estás?, Te ves Bien eh!!");
    }
    abstract void saludo();
}


interface Mostrar{
    //Que hace
    void show();
    void despide();
}


public class SaludosCordiales implements Mostrar {
    public void show(){
        System.out.println("Hola,¿Cómo estás?, espero no del todo mal ....");
    }

    public void despide(){
        System.out.println("Gracias no.");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }


}
