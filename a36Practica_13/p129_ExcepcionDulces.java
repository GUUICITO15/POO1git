package a36Practica_13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class p129_ExcepcionDulces {
    public static void dulces() {
        Scanner sc = new Scanner(System.in);
        int ninios, dulces, dulcesXNinio;

        try {
            System.out.print("Numero de niños en el barrio: ");
            ninios = sc.nextInt();
            System.out.print("Cantidad de dulces exitente : ");
            dulces = sc.nextInt();

            dulcesXNinio = dulces / ninios;

            if (dulces == 0)
                System.out.println("Si no hay dulces, no puedo repartir dulces");
            else
                System.out.println("A cada niño le tocan " + dulcesXNinio + " dulces.");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay niños, ¿a quien le doy los dulces?");

        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        }
    }
    
    public static void main(String[] args) {
        dulces();
        System.out.println();
        dulces();
        System.out.println();
        dulces();
        System.out.println();
        dulces();
    }
}
