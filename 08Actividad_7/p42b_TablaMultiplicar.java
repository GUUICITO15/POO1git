// p42b_TablaMultiplicar - Imprimir la tabla deseada de 1 a n
// 28 - 08 - 2024       v.2
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p42b_TablaMultiplicar {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int c,t,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Imprimir la tabla deseada de 1 a n\n");

        System.out.print("Que tabla quieres ? ");
        t = sc.nextInt();
        System.out.print("Hasta donde ? ");
        n = sc.nextInt();

        c = 1;
        while (c <= n) {
            System.out.printf("%d x %d = %d\n", t, c, c * t);
            c++;
        }
        
        System.out.println("\nProceso terminado ...");
        sc.close();
    }
    
}
