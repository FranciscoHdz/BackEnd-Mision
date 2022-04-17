package Semana2;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicicleta de Montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor() {
        System.out.println("Cambiando color a rojo");
    }
}


class Magistroni extends Mountain {
    void cambiarVelocidad(){
        System.out.println("se deben modificar las perillas");
    }
}


public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
