package Semana1.viernes;

class Animal{
    String color = "Blanco";

    Animal(){
        System.out.println("Se crea un Animal");
    }

    void eat(){
        System.out.println("Comiendo .... ");
    }
}

class Gato extends Animal{
    String color = "Cafe";

    void printColor(){
        System.out.println("Color de la clase Gato: "+color);
        System.out.println("Color de la clase Animal: "+super.color);
    }

    //caso 2
    void eat(){
        System.out.println("Come atún");
    }

    void dormir(){
        System.out.println("Ya se durmio el gato");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        System.out.println("Se ha creado un Gato");
    }
}



public class SuperTest {
    public static void main(String[] args) {
        new Gato().printColor();

        new Gato().call();

        new Gato();
    }
}
