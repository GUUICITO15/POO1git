// p45_ImparesDescendente - Imprime numeros impares descendente
// 28 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p45_ImparesDescendente {
    public static void main(String[] args) {
        int n,c,s;
        char resp;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        
            System.out.println("Imprime números impares descendente\n");

            System.out.print("Desde donde ? ");
            n = sc.nextInt();
            
            s = 0;
            c = ( n % 2 == 0 ? --n : n);
            while (c >= 1) {
                System.out.printf("%d ", c);
                s = s + c;
                c = c - 2;
            }
            
            System.out.printf("\nLa suma es %d", s);

            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(sc.next().charAt(0));
        } while (resp != 'N');
        
        System.out.println("\nGracias por utilizar este programa !");
        sc.close();
    }
}
