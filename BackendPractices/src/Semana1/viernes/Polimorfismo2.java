package Semana1.viernes;

class Animal2{
    void eat(){
        System.out.println("Comiendo");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Comiendo Croquetas");
    }
}

class Cachorro extends Animal{
    void eat(){
        System.out.println("Tomando Agua");
    }
}



public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal pongo;
        pongo = new Animal();
        pongo.eat();
        pongo = new Dog();
        pongo.eat();
        pongo = new Cachorro();
        pongo.eat();

    }
}
