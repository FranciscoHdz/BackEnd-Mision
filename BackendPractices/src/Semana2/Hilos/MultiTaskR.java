package Semana2.Hilos;

public class MultiTaskR {
    public static void main(String[] args) {
        Runnable r1 =  new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 ");
            }
        };

        Thread t1 = new Thread(r1),
                t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
