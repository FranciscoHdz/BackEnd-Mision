package practicaMona;

import java.security.PublicKey;

public class Octocat {
    public String Nombre,Ocupacion,Especie;

    //Constructor
    public Octocat(String Nombre,String Ocupacion,String Especie){
        this.Nombre = Nombre;
        this.Ocupacion = Ocupacion;
        this.Especie = Especie;
    }

    //Setters
    public boolean setNombre(String Nombre){
        if(!Nombre.isEmpty()){
            this.Nombre = Nombre;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setOcupacion(String Ocupacion){
        if(!Ocupacion.isEmpty()){
            this.Ocupacion = Ocupacion;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setEspecie(String Especie){
        if(!Especie.isEmpty()){
            this.Especie = Especie;
            return  true;
        }
        else{
            return false;
        }
    }

    void Actividad(){
        System.out.println("Hola soy "+this.Nombre +" y soy el Octocat original");
    }


    //Getters
    public String getNombre() { return Nombre; }
    public  String getOcupacion() { return  Ocupacion ;}
    public String getEspecie() { return Especie; }
}
