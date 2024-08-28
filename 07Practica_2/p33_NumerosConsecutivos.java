// p33_NumerosConsecutivos - Dados tres números enteros, verificar si son consecutivos
// 26 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Dame el tercer numero: ");
        num3 = sc.nextInt();

        if (num2 == (num1 + 1) && num3 == (num1 + 2))
            System.out.printf("\n(%d, %d y %d) son consecutivos\n", num1, num2, num3);
        else
            System.out.println("\nError, no son consecutivos");

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}