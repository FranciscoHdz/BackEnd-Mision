package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOString {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("C:\\Users\\Paco\\Desktop\\PruebaString.txt");
            String texto =  "Prueba de cadena de texto sobre un archivo";
            byte b[] = texto.getBytes();
            file.write(b);
            file.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
