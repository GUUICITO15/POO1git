// p76_NumeroMenor - Calcula e imprime el menor de cuatro numeros
// 18 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p76_NumeroMenor {

    /**
     * comparas 4 numeros y regresa el menor
     * @param n1 (int) primer numeros a comparar
     * @param n2 (int) segundo numeros a comparar
     * @param n3 (int) tercero numeros a comparar
     * @param n4 (int) cuarto numeros a comparar
     * @return el valor más pequeño de los 4 (float)
     */
    public static float menor(float n1, float n2, float n3, float n4) {
        float men = 0;

        men = Math.min(Math.min(n1, n2), Math.min(n3, n4));

        return men;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        float n1, n2, n3, n4;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame cuatro numeros separados por <Enter>? ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        System.out.printf("\nEl menor de los cuatro números es: %.2f", menor(n1, n2, n3, n4));

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
