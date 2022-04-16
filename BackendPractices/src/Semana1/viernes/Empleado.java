package Semana1.viernes;

public class Empleado {
    double salario = 40000;
}

class Programador extends Empleado{
    int bono = 1000;

    //Redefinicion del metodo main
    public void main(){
        Programador paco = new Programador();
        System.out.println("El salario del programador es: "+paco.salario);
        System.out.println("El bono del programador es:" + paco.bono);

    }

    void mesage(){
        System.out.println("Soy programador.");
        main();
    }
}

class Web extends Programador{
    public static void main(String[] args) {
        Web w = new Web();
        w.mesage();
    }
}

/*
* -> Herencia simple -> De empleado a Programador
* -> Herencia multinivel -> De empleado a Programador web
* -> Herencia jerárquica -> De empleado a Programador o empleado Web
* */