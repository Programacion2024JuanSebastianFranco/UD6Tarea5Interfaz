package Videojuego;

import java.util.Random;

public class Asesino implements Enemigo, Defendible{

    public static int probAtaque = 6;

    @Override
    public void atacar() {
        System.out.println("(Asesino) >>>>>>>> esta atacando apuñalando con una daga");
    }

    @Override
    public void patrullar() {
        System.out.println("(Asesino) -------- esta escalando y reconociendo el area");
    }

    @Override
    public void aplicarDefensa() {
        System.out.println("(Asesino) //////// se defiende mostrando su hoja oculta");
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
