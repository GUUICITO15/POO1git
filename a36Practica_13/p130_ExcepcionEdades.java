package a36Practica_13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            do {
                try {
                    System.out.print("Edad persona " + (i + 1) + ": ");
                    edades[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero");
                    sc.next();
                }
            } while (true);
        }

        System.out.println("\nCaptura terminada las edades son:...");

        for (int i : edades) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
