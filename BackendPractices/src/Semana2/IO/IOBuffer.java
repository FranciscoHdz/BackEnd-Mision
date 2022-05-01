package Semana2.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBuffer {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Paco\\Desktop\\PruebaStringHB.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String s = "Prueba de texto en Bufffer \n En archivos";
            byte[] b  = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fos.close();
            System.out.println("Fin!!!!");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
