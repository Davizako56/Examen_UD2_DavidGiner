package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int año = 0;
        int edad = 0;
        boolean err = true;
        boolean sol = true;

        while (err) {
            try {
                System.out.println("Introduce tu año de nacimiento...");
                año = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        while (sol) {
            try {
                while (año < 1900 || año > 2024) {

                    System.out.println("ERROR: Tu año de nacimiento se sale de los límites.");
                    System.out.println("Introduce tu año de nacimiento...");
                    año = entrada.nextInt();
                }
                sol = false;

            }catch(InputMismatchException so) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        for (año = año; año <= 2024; año++) {
            System.out.println(año + " - edad: " + edad);
            edad++;
        }
    }
}
