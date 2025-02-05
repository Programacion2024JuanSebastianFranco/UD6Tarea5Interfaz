package Videojuego;

import java.util.Random;

public class Main {
    static int tamaño = 5;
    static Enemigo[] enemigos = new Enemigo[tamaño];

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < tamaño; i++){
            int opc = random.nextInt(1,5);
            enemigos[i] = switch (opc){
                case 1 -> new Robot();
                case 2 -> new Zombie();
                case 3 -> new Asesino();
                default -> new Mago();
            };
        }

        while (true){
            for (int i = 0; i < tamaño; i++){
                enemigos[i].cambiarEstado();
            }

            try {
                Thread.sleep(1000 + random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------------------------------------------------------------------");
        }
    }
}
