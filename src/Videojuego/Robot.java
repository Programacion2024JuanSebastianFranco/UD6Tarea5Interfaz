package Videojuego;

import java.util.Random;

public class Robot implements Enemigo{

    public static int probAtaque = 7;


    @Override
    public void atacar() {
        System.out.println("(Robot) >>>>>>>>>>> esta atacando con su rayo lazer!");
    }

    @Override
    public void patrullar() {
        System.out.println("(Robot) ---------- esta patrullando la zona girando la cabeza");
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
