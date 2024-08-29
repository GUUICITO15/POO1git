// p39b_Numeros1a100 - Imprimir los números de 1 a un numero dado
// 28 - 08 - 2024       v.2
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p39b_Numeros1a100 {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int num = 0, numFin;
        Scanner sc = new Scanner(System.in);

        System.out.print("dame el valor final de la lista: ");
        numFin = sc.nextInt();

        do {
            num++;

            System.out.printf("%d ", num);
            
            if (num % 10 == 0)
                System.out.println();

            if (num >= 10000){
                System.out.println("\nEl numero es demaciado largo le dejaremos aquí, faltaron " + (numFin - num) + " por imprimir");
                break;
            }
        } while (num < numFin);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
    
}
