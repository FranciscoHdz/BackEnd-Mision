package Semana2.IO;

import javax.swing.plaf.TableHeaderUI;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStringHilo {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream file = new FileOutputStream("C:\\Users\\Paco\\Desktop\\PruebaStringH.txt");
                    String texto =  "Prueba de cadena de texto sobre un archivo";
                    byte b[] = texto.getBytes();
                    file.write(b);
                    file.close();
                }
                catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(rm);
        t1.start();
    }
}
