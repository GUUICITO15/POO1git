// p68_SumaRango - Suma de un rango de numeros
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p68_SumaRango {
    public static float SumaRango(float ini, float fin) {
        float s = 0;

        for (float i = ini; i <= fin; i++)
            s += i;

        return s;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        float i, f, res;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Dame inicio : ");
            i = sc.nextFloat();
            System.out.print("Dame fin : ");
            f = sc.nextFloat();

        } while (i > f);

        res = SumaRango(i, f);

        System.out.printf("\nLa suma del rango es %.2f", res);

        sc.close();
    }
}
