// p52_Numeros1aN - Numeros de 1 a n con paso de p
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int n, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("Numeros de 1 a n con paso de p");

        System.out.print("Hasta donde? ");
        n = sc.nextInt();
        
        System.out.print("Paso? ");
        p = sc.nextInt();
        
        for(int i = 1; i <= n; i += p) {
            System.out.printf("%d ", i);
        }
        sc.close();
    }
}
