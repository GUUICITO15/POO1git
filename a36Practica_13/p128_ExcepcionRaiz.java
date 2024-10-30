package a36Practica_13;

import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;

        try {
            System.out.println("Introduce un numero: ");
            num1 = sc.nextFloat();

            System.out.println("El resultado es: " + Math.sqrt(num1));
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raiz cuadrada");
        }

        sc.close();
    }
}
