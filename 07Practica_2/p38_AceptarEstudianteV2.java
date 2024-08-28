// p38_AceptarEstudianteV2 - Acepta a un estudiante en base a su edad, genero y sus calificaciones
// 27 - 08 - 2024       v.2
// Luis Manuel Flores - POO1

import java.util.Scanner;
import java.util.ArrayList;

public class p38_AceptarEstudianteV2 {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Float auxCalif, promedio;
        ArrayList<Float> calificaciones = new ArrayList<Float>();
        int contadorCalif = 0, edad;
        char genero;
        Scanner sc = new Scanner(System.in);
        

        do {
            System.out.println("¿cual es tu genero?\n");
            System.out.println("[M]ujer");
            System.out.println("[H]ombre");
            System.out.println("[O]tro");
            genero = Character.toUpperCase(sc.next().charAt(0));
        
        } while (genero != 'M' && genero != 'H' && genero != 'O');

        if (genero == 'M') {
            System.out.print("\nDame tu edad: ");
            edad = sc.nextInt();

            if (edad >= 21) {
                System.out.println();
                while (contadorCalif < 3) {
                    System.out.printf("Dame la calificación %d: ", (contadorCalif + 1));
                    auxCalif = sc.nextFloat();

                    if (auxCalif >= 0 && auxCalif <= 10) {
                        calificaciones.add(auxCalif);
                        contadorCalif++;
                    } else {
                        System.out.println("calificación invalida, por favor que sea un valor del 0 al 10");
                    }
                }
                
                promedio = (calificaciones.get(0) + calificaciones.get(1) + calificaciones.get(2)) / 3;

                if (promedio >= 8 && promedio <= 10)
                    System.out.println("\n\nHaz sido aceptada, ¡FELICIDADES!\n");
                else
                    System.out.println("\nSolo aceptamos a chicas con promedios a partir de 8, lo lamentamos");
            } else
                System.out.println("\nSolo aceptamos a mayores de 21, lo lamentamos");
        } else
            System.out.println("\nSolo aceptamos a Mujeres, lo lamentamos");
        
        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
