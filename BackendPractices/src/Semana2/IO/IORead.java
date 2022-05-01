package Semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IORead {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Paco\\Desktop\\PruebaStringH.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
