package practicaMona;

class Pythocat extends Octocat{
    public  Pythocat(String Nombre,String Ocupacion,String Especie){
        super(Nombre,Ocupacion,Especie);
    }
    @Override
    void Actividad() {
        System.out.println("Hola soy "+this.Nombre + " y estoy programando en Python");
    }
}


class DoctocatBrown extends Octocat{
    public DoctocatBrown(String Nombre,String Ocupacion, String Especie){
        super(Nombre,Ocupacion,Especie);
    }

    @Override
    void Actividad() {
        System.out.println("Hola soy "+this.Nombre +" y estoy regresando al Futuro");
    }
}


class HeisenCat extends Octocat{
    public HeisenCat(String Nombre,String Ocupacion, String Especie){
        super(Nombre,Ocupacion,Especie);
    }

    @Override
    void Actividad() {
        System.out.println("Hola soy "+this.Nombre +" y estoy creando Meta");
    }
}

class HomerCat extends Octocat{
    public HomerCat(String Nombre,String Ocupacion, String Especie){
        super(Nombre,Ocupacion,Especie);
    }

    @Override
    void Actividad() {
        System.out.println("Hola soy "+this.Nombre +" y estoy Tomando una Cerveza");
    }
}

class Spidertocat extends Octocat{
    public Spidertocat(String Nombre,String Ocupacion, String Especie){
        super(Nombre,Ocupacion,Especie);
    }

    @Override
    void Actividad() {
        System.out.println("Hola soy "+this.Nombre +" y estoy salvando a NY");
    }
}


class Catstello extends Octocat{
    public Catstello(String Nombre,String Ocupacion, String Especie){
        super(Nombre,Ocupacion,Especie);
    }

    @Override
    void Actividad() {
        System.out.println("Hola soy "+this.Nombre + " y estoy en una fiesta tocando");
    }
}



public class Mona {
    public static void main(String[] args) {
        Pythocat ocat1 = new Pythocat("Pythocat","Programador","Octocat");
        DoctocatBrown ocat2 = new DoctocatBrown("DoctocatBrown","Cientifico","Octocat");
        HeisenCat ocat3 = new HeisenCat("HeiseCat","Profesor de quimica","Octocat");
        HomerCat ocat4 = new HomerCat("Homercat","Sepervisor Nuclear","Octocat");
        Spidertocat ocat5 = new Spidertocat("Spidertocat","Superheroe","Octocat");
        Catstello ocat6 = new Catstello("Catsello","DJ","Octocat");
        Octocat ocat7 = new Octocat("Octocat","Imagen de Github","Octocat");

        ocat1.Actividad();
        ocat2.Actividad();
        ocat3.Actividad();
        ocat4.Actividad();
        ocat5.Actividad();
        ocat6.Actividad();
        ocat7.Actividad();

    }
}
