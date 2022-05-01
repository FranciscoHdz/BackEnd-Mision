package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOHilos {
    public static void main(String[] args) throws InterruptedException {
        Runnable h1 = new Runnable(){
            @Override
            public void run() {
              try{
                  FileOutputStream archivo = new FileOutputStream("C:\\Users\\Paco\\Desktop\\pruebaHilos.txt");

                  for(int x =65; x < 80; x++){
                      archivo.write(x);
                  }
                  archivo.close();
              }
              catch (IOException ioe){
                  ioe.printStackTrace();
              }
            }
        };

        Runnable h2 = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream archivo2 =  new FileOutputStream("C:\\Users\\Paco\\Desktop\\pruebaHilos2.txt");

                    for(int y=0 ; y<= 10; y++){
                        archivo2.write(64);
                    }

                    archivo2.close();
                }
                catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };



        Thread writeFile =  new Thread(h1);
        Thread writeFile2 = new Thread(h2);
        writeFile.start();
        writeFile2.start();
        writeFile2.join(1);
    }
}
