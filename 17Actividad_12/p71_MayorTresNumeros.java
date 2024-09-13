// p71_MayorTresNumeros - Calcula e imprime el mayor de tres numeros
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p71_MayorTresNumeros {
    public static float Mayor(float n1, float n2, float n3) {
        float may = 0;

        may = Math.max(Math.max(n1, n2), n3);

        return may;
    }
    

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        float n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame tres numeros separados por espacio? ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        
        System.out.printf("\nEl mayor de los tres números es: %.2f", Mayor(n1, n2, n3));

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
    
}
