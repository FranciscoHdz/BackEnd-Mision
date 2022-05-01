package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try{
            //Genracion de Archivo
            FileOutputStream fos = new FileOutputStream("C:\\Users\\paco\\Desktop\\prueba.txt");
            fos.write(65);
            fos.close();
        }
        catch (IOException ioe){
            // controla los posibles errores por Input o Output
            ioe.printStackTrace();
        }
    }
}
