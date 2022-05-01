package Semana2.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOBufferRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Paco\\Desktop\\PruebaStringHB.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            while ((i = bis.read())!=-1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
