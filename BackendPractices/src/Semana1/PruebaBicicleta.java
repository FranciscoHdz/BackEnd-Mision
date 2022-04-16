package Semana1;

public class PruebaBicicleta {

    public static void main(String[] args) {
        def();
    }


    public static void  def(){
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Roja");
        biciMountain.setPins(5);
        biciMountain.setRodada(20);
        biciMountain.setVelocidad(12.8);

        String msg = "Soy una bici de montaña con estas caracteristicas: \n";
        msg += "\n Color: " + biciMountain.getColor();
        msg += "\n Pines: " + biciMountain.getPins();
        msg += "\n Velocidad: " + biciMountain.getVelocidad();
        msg += "\n Rodada: " + biciMountain.getRodada();

        System.out.print(msg);
    }
}
