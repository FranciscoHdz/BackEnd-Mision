package Semana1.viernes;

//Monolítico

// Clase padre
class Persona{
    int id;
    String nombre;

    Persona(int id,String nombre){
        this.id =  id;
        this.nombre = nombre;
    }
}

//Herencia simple
public class Emp extends Persona{
    double salario;

    //Constructor
    Emp(int id,String nombre, double salario){
        super(id,nombre);
        this.salario = salario;
    }

    void display(){
        System.out.println("ID: "+id+"\nNOMBRE: "+nombre+"\nSALARIO: "+salario);
    }
}

class TestPersonaEmpleado{
    public static  void main(String[] args){
        Emp emp =  new Emp(1,"Francisco",38520.98);
        emp.display();
    }
}