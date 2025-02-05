package Videojuego;

import java.util.Random;

public class Zombie implements Enemigo{

    public static int probAtaque = 4;


    @Override
    public void atacar() {
        System.out.println("(Zombie) >>>>>>>> esta mordiendo y moviendo los brazos!");
    }

    @Override
    public void patrullar() {
        System.out.println("(Zombie) --------- anda lentamente perdido");
    }

    @Override
    public void cambiarEstado() {
        Random random = new Random();
        int num = random.nextInt(1,11);
        if (probAtaque >= num){
            atacar();
        }else {
            patrullar();
        }
    }
}
