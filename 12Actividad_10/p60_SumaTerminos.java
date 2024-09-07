// p60_SumaTerminos - pantilla de trabajo POO en java
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args) {
        char resp;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
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
