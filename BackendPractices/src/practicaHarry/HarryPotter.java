package practicaHarry;


public class HarryPotter {
    public static void main(String[] args) {
        Mago Harrypotter =  new Mago(); //Constructor Default
        Mago AlbusDumbledore = new Mago("Albus Dumbledore","Humano","Masculino","Soltero","Mestizo"); //Constructor 1
        Mago HermioneGranger =  new Mago("Hermione Granger","Humano","Femenino","Casada","Hija de Muggles",
                "Gryffindor","","Nutria",""); //Constructor2
        Mago Ron = new Mago("Ronald Weasly","Humano","Masculino","Casado","Pura"); //Constructor 1
        Mago SiriusBlack = new Mago(); //Constructor defualt

        Harrypotter.setNombre("Harry Potter");
        Harrypotter.setEspecie("Humano");
        Harrypotter.setGenero("Masculino");
        Harrypotter.setEstadoCivil("Casado");

    }
}



