package Semana2.Hilos;




public class HilosT extends Thread {

    @Override // Entra a Runnable
    public void run() {
        System.out.println("El hilo se esta ejecutando");
    }
    /*

    public void start(){
        //Inicar la ejecucion de un Hilo
        // La JV llama al metodo Run del Hilo
    }

    sleep --> detine de manera temporal
    join --> Espera a que el hilo se muera
    getPriority --> regresa la prioridad del hilo
    getName --> Nombre del Hilo
    currentThread --> referencia al hilo que se esta ejecutando
    getId --> Regresa el id del hilo
    Thread.State getState --> regeresa el estado del hilo
    isAlive --> Esta vivo el hilo



    */
    public static void main(String[] args) {
        HilosT hilo = new HilosT(); // Entra al estado new
        hilo.start();

    }
}


class  HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable esta corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }


}
