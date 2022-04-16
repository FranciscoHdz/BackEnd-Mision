package Semana1.viernes;

/*
Overload: Sobrecarga
Override: Redefinir
Overwrite: Sobreescribir
*/

public class Bike {
    private int velocidad;
    private String color, marca;

    //Constructor por Default u omisión
    public Bike(){}

   // Sobrecarga del constructor
    public Bike(String color){
        this.color = color;
    }

    public Bike(String color, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }

    public  Bike(String color, int velocidad, String marca){
        this.color = color;
        this.velocidad=velocidad;
        this.marca=marca;
    }



    // Definición de métodos
    public int getVelocidad(){ return  velocidad; }
    public  String getColor(){ return  color; }
    public  String getMarca(){ return marca;  }




}
