// p34_NumeroMayor - Dados tres números enteros, verificar cual es el mayor
// 26 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int num1, num2, num3, max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Dame el tercer numero: ");
        num3 = sc.nextInt();
        
        max = Math.max(Math.max(num1, num2), num3);

        System.out.printf("\n%d es el numero más grande\n", max);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}