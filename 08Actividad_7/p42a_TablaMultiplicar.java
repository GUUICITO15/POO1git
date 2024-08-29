// p42a_TablaMultiplicar - Imprimir la tabla deseada de 1 a 10
// 28 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p42a_TablaMultiplicar {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int c,t;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Imprimir la tabla deseada de 1 a 10\n");

        System.out.print("Que tabla quieres ? ");
        t = sc.nextInt();

        c = 1;
        while (c <= 10) {
            System.out.printf("%d x %d = %d\n", t, c, c * t);
            c++;
        }
        
        System.out.println("\nProceso terminado ...");
        sc.close();
    }
    
}
