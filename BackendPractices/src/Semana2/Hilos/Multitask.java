package Semana2.Hilos;

public class Multitask extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea 1");
    }

    public static void main(String[] args) {
        Multitask mt1 =  new Multitask(),
                  mt2 =  new Multitask(),
                  mt3 = new Multitask();

        mt1.start();
        mt2.start();
        mt3.start();

    }
}


class Multitasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea 1 Runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Multitasking()); // Por declaracion anonima
        Thread t2 = new Thread(new Multitasking());

        Task1 tk1 = new Task1();
        Task2 tk2 = new Task2();

        t1.start();
        t2.start();

        tk1.start();
        tk2.start();

    }
}


class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A Runnable");
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B Runnable");
    }
}
