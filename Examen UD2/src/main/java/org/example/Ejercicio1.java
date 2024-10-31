package org.example;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String elec;
        int ene = random.nextInt(1,3);
        String piedra = "Piedra";
        String papel = "Papel";
        String tijera = "Tijera";
        int i = 1;

        while (i <= 3) {

            System.out.println("Ronda " + i + ":");

            System.out.println("Escoja su elección...");
            elec = entrada.next();

            if (elec.equals(piedra)) {

                switch(ene) {

                    case 1:
                        System.out.println("El ordenador ha escogido: Piedra");
                        System.out.println("Ha sido un empate!");
                        i++;
                        break;

                    case 2:
                        System.out.println("El ordenador ha escogido: Papel");
                        System.out.println("Has perdido!");
                        i++;
                        break;

                    case 3:
                        System.out.println("El ordenador ha escogido: Tijera");
                        System.out.println("Has ganado!");
                        i++;
                        break;

                }
            }

            if (elec.equals(papel)) {

                switch(ene) {

                    case 1:
                        System.out.println("El ordenador ha escogido: Piedra");
                        System.out.println("Has ganado!");
                        i++;
                        break;


                    case 2:
                        System.out.println("El ordenador ha escogido: Papel");
                        System.out.println("Ha sido un empate!");
                        i++;
                        break;


                    case 3:
                        System.out.println("El ordenador ha sacado: Tijera");
                        System.out.println("Has perdido!");
                        i++;
                        break;

                }
            }

            if (elec.equals(tijera)) {

                switch(ene) {

                    case 1:
                        System.out.println("El ordenador ha escogido: Piedra");
                        System.out.println("Has perdido!");
                        i++;
                        break;


                    case 2:
                        System.out.println("El ordenador ha escogido: Papel");
                        System.out.println("Has ganado!");
                        i++;
                        break;


                    case 3:
                        System.out.println("El ordenador ha escogido: Tijera");
                        System.out.println("Ha sido un empate!");
                        i++;
                        break;
                }
            }

        }









    }
}
