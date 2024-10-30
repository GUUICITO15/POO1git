package a36Practica_13.p131_ExcepcionTemperatura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static double farenheit(double centigrados) throws TemperturaExcesiva {
        if (centigrados > 100)
            throw new TemperturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        ;
        return (centigrados * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double centigrados, farenheit;

        do {
            try {
                System.out.println("\nDame una temperatura en centigrados: ");
                centigrados = sc.nextDouble();

                farenheit = farenheit(centigrados);

                System.out.println(centigrados + " grados centigrados, equivale a " + farenheit + " grados farenheit");

                break;
            } catch (TemperturaExcesiva e) {
                System.out.println("Error: " + e);
            } catch (InputMismatchException e) {
                System.out.println("La teperatura a convertir, debe ser un valor numérico");
                sc.next();
            }
        } while (true);

        sc.close();
    }
}
