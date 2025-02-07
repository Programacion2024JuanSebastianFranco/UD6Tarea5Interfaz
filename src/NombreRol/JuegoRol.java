package NombreRol;

import java.util.Random;
import java.util.Scanner;

public class JuegoRol{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();


        String[] nombre = {"Guerrero", "Mago", "Arquero"};
        String[] roles = {"Un luchador valiente", "Un experto en magia", "Un experto con el arco"};

        String[] habilidades = {"Fuerza", "Fuego", "Precisión"};
        String[] descHabilidades = {"Aumenta mi poder de ataque", "Lanza una bola de fuego", "Mejora la puntería con el arco"};

        int num = 3;
        JuegoRol juego = new JuegoRol(num);

        for (int i = 0; i < num; i++) {
            String r = nombre[i];
            String descRol = roles[i];

            Rol rol = new Rol() {
                @Override
                public void describir() {
                    System.out.println(descRol);
                }
            };

            String ha = habilidades[i];
            String descHab = descHabilidades[i];

            Habilidad hab = new Habilidad() {
                @Override
                public void activar() {
                    System.out.println(ha + " - " + descHab);
                }
            };

            Personaje personaje = new Personaje(r, rol, hab);
            juego.guardarPersonaje(personaje, i);
        }


         // int numJug;
        // do {
         while (true) {
            System.out.println("---------------¡¡¡¡SELECCION!!!!!!--------------------");
            System.out.println("Introduce dos jugadores a luchar (0 a " + (num - 1) + "):");
            juego.mostrarPersonajes();

            // numJug = scan.nextInt();

            int numRol = ran.nextInt(0, 3);
            int numRol2 = ran.nextInt(0, 3);
            while (numRol == numRol2) {
                numRol2 = ran.nextInt(0, 3);
            }

            System.out.println("---------------¡¡¡¡A LUCHAR!!!!!!--------------------");
            juego.luchar(numRol, numRol2);

            try {
                Thread.sleep(1000 + ran.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /* if (numJug == -1){
                System.out.println("---------------¡¡¡¡A LUCHAR TODOS!!!!!!--------------------");
                juego.lucharTodos();
            } */
        }
        // } while (numJug != -1);

    }


    private Personaje[] personajes;

    public JuegoRol(int numJugadores) {
        this.personajes = new Personaje[numJugadores];
    }

    public void guardarPersonaje(Personaje personaje, int pos) {
        if (personajes[pos] == null) {
            personajes[pos] = personaje;
        } else {
            System.out.println("Ya existe un personaje en esta posicion");
        }
    }

    public void mostrarPersonajes() {
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i].getNombre());
        }
    }

    public void lucharTodos() {
        for (int i = 0; i < personajes.length; i++) {
            personajes[i].getHabilidad().activar();
        }
    }

    public void luchar(int jugador1, int jugador2) {
        for (int i = 0; i < personajes.length; i++) {
            if (jugador1 == i) {
                personajes[i].getHabilidad().activar();
            } if (jugador2 == i){
                personajes[i].getHabilidad().activar();
            }
        }
    }

}
