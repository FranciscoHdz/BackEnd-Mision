package practicaHarry;

public class Mago {
    public String Nombre,Especie,Genero,Boggart,Casa,Patronous,Ocupacion,EstadoCivil,Sangre;

    //Constructores
    public Mago(){};

    public Mago(String Nombre, String Especie,String Genero,String EstadoCIvil,String Sangre){
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Genero = Genero;
        this.EstadoCivil = EstadoCivil;
        this.Sangre = Sangre;
    }

        public Mago(String Nombre, String Especie,String Genero,String EstadoCivil,String Sangre,String Casa,String Boggart,String Patronous,String Ocupacion){
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Genero = Genero;
        this.EstadoCivil = EstadoCivil;
        this.Sangre = Sangre;
        this.Casa = Casa;
        this.Boggart = Boggart;
        this.Patronous  = Patronous;
        this.Ocupacion = Ocupacion;

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

    public boolean setEspecie(String Especie){
        if(!Especie.isEmpty()){
            this.Especie = Especie;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setGenero(String Genero){
        if(!Genero.isEmpty()){
            this.Genero = Genero;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setBoggart(String Boggart){
        if(!Boggart.isEmpty()){
            this.Boggart = Boggart;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setCasa(String Patronous){
        if(!Patronous.isEmpty()){
            this.Patronous = Patronous;
            return true;
        }else{
            return false;
        }
    }


    public boolean setPatronous(String Patronous){
        if(!Patronous.isEmpty()){
            this.Patronous = Patronous;
            return true;
        }else{
            return false;
        }
    }

    public boolean setOcupacion(String Ocupacion){
        if(!Ocupacion.isEmpty()){
            this.Ocupacion = Ocupacion;
            return true;
        }else{
            return false;
        }
    }

    public boolean setEstadoCivil(String EstadoCivil){
        if(!EstadoCivil.isEmpty()){
            this.EstadoCivil = EstadoCivil;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setSangre(String Sangre){
        if(!Sangre.isEmpty()){
            this.Sangre = Sangre;
            return true;
        }
        else{
            return false;
        }
    }


    //Getters
    public String getNombre(){ return Nombre; }
    public String getEspecie(){ return  Especie; }
    public String getGenero(){ return  Genero; }
    public String getBoggart(){ return  Boggart; }
    public String getCasa() { return  Casa; }
    public String getPatronous() { return  Patronous; }
    public  String getOcupacion() { return Ocupacion; }
    public  String getEstadoCivil() { return  EstadoCivil; }
    public String getSangre(){ return  Sangre; }

}
