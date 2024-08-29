// p39c_Numeros1a100 - Imprimir los números de 1 a un numero dado con saltos de otro numero dado 
// 28 - 08 - 2024       v.3
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p39c_Numeros1a100 {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int num = 0, numFin, salto = 1, impreciones = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("dame el valor final de la lista: ");
        numFin = sc.nextInt();
        System.out.print("dame haremos la lista de ¿cuantos en cuantos?: ");
        salto = sc.nextInt();

        do {
            num = num + salto;
            impreciones++;

            System.out.printf("%d ", num);

            if (impreciones % 10 == 0)
                System.out.println();

            if (impreciones >= 10000){
                System.out.println("\nEl numero es demaciado largo le dejaremos aquí, faltaron " + ((numFin/salto) - impreciones) + " por imprimir");
                break;
            }
        } while (num < numFin);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
    
}
