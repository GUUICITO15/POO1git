// p21_VerificaNumero - Verifica si un número es postivo, negativo o cero
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p21_VerificaNumero{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Verfica si un número es postivo, negativo o cero\n");

        System.out.print("Dame un numero ? ");
        n = sc.nextInt();

        if (n > 0)
            System.out.println("El número es POSITIVO");

        if (n < 0)
            System.out.println("El número es NEGATIVO");

        if (n == 0)
            System.out.println("El número es CERO");

        System.out.println("\nGracias por utilizar este programa");
        sc.close();
    }
}