// p59_FactorialNumeros - pantilla de trabajo POO en java
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p59_FactorialNumeros {
    public static void main(String[] args) {
        int i,j,n,f;
        char resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.print("Cuantos números ? ");
            n = sc.nextInt();
            
            for (i = 1; i <= n; i++) {
                System.out.printf("%d!=", i);
                f = 1;
                for (j = 1; j <= i; j++) {
                    f *= j;
                }
                System.out.println(f);
            }
            
            while (true){
                System.out.print("\nDeseas continuar (S/N)? ");
                resp = Character.toUpperCase(sc.next().charAt(0));
                if (resp == 'N' || resp == 'S')
                    break;
                else
                    System.out.println("responde con S (si) o N (no)");
            }
        } while (resp != 'N');

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
