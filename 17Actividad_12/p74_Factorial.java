// p74_Factorial - Calcula e imrime el factorial de un número
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p74_Factorial {
    public static double Factorial(int n) {
        double f = 1;

        for (int i = 1; i <= n; i++)
            f = f * i;

        return f;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero? ");
        n = sc.nextInt();

        System.out.printf("\nEl factorial de %d es %.0f", n, Factorial(n));

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
