// p64_SumaTerminos2 - Suma de n 1s
// 05 - 09 - 2024       v.3
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        int num;
        char resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.print("Cuantos números? ");
            num = sc.nextInt();
            
            for (int i = 1; i <= num; i++) {
                if (i != 1)
                    System.out.print("+ ");
                else
                    System.out.print("  ");
                
                if (num != i)
                    System.out.printf("%-" + (num - i) + "s", "");

                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
                System.out.println();
            }
            
            System.out.print("= ");

            for (int i = 1; i <= num; i++) {
                System.out.print(i);
            }
            
            System.out.println();
            
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
