package Videojuego;

import java.util.Random;

public class Mago implements Enemigo, Defendible{

    public static int probAtaque = 5;

    @Override
    public void atacar() {
        System.out.println("(Mago) >>>>>>>> esta atacando con su aura");
    }

    @Override
    public void patrullar() {
        System.out.println("(Mago) -------- esta patrullando la zona girando la cabeza");
    }

    @Override
    public void aplicarDefensa() {
        System.out.println("(Mago) //////// se defiende mostrando su escudo");
    }

    @Override
    public void cambiarEstado() {
        Random random = new Random();
        int num = random.nextInt(1,11);
        if (probAtaque >= num){
            atacar();
            aplicarDefensa();
        }else {
            patrullar();
        }
    }

}
