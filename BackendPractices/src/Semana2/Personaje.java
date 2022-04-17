package Semana2;

//Abstracción
//Que hace
abstract class Sombra{
    abstract void dibujarSombra();
}

class Arma extends Sombra{
    void dibujarSombra(){
        System.out.println("Dibujando Sombras en el arma ");
    }
}


public class Personaje extends  Arma{
    public static void main(String[] args) {
        Sombra personaje = new Personaje();
        Sombra arco = new Arma();

        personaje.dibujarSombra();
        arco.dibujarSombra();
    }

    void dibujarSombra(){
        System.out.println("Dibujar sombra color blanco");
    }

}
