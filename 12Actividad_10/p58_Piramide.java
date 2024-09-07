// p58_Piramide - pantilla de trabajo POO en java
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p58_Piramide {
    public static void main(String[] args) {
        int i,j,n;
        char car, resp;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Cuantos renglones ? ");
            n = sc.nextInt();
            
            System.out.print("De que caracter ? ");
            car = sc.next().charAt(0);

            for(i=1; i<=n; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print(car);
                }
                System.out.println();
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
