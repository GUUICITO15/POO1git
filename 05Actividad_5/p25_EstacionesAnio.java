// p25_EstacionesAnio - Muestra la estación del año que corresponde al número introducido
// 22 - 08 - 2024       v.1.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p25_EstacionesAnio {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Muestra la estacion del año en base al número:\n");

        System.out.print("Dame un numero (1..4) ? ");
        n = sc.nextInt();

        System.err.println("\nLa estación es:");
        if(n==1)
            System.out.println("\tPrimavera");
        else if (n==2)
            System.out.println("\tVerano");
        else if (n==3)
            System.out.println("\tOtoño");
        else if (n==4)
            System.out.println("\tInvierno");
        else
            System.out.println("\tIncorrecta...");

        System.out.println("\nProceso terminado....");
        sc.close();
    }
}