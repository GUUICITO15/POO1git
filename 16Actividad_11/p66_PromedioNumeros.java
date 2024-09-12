// p66_PromedioNumeros - Calcula el promedio de tres números usando una función
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p66_PromedioNumeros {
    public static float promedio(float n1, float n2, float n3) {
        float suma;
        suma = n1 + n2 + n3;
        return suma/3;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        float n1, n2, n3, prom;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame número 1 : ");
        n1 = sc.nextFloat();
        System.out.print("Dame número 2 : ");
        n2 = sc.nextFloat();
        System.out.print("Dame número 3 : ");
        n3 = sc.nextFloat();
        
        prom = promedio(n1, n2, n3);

        System.out.printf("\nEl promedio es %.2f", prom);
        sc.close();
    }
}
