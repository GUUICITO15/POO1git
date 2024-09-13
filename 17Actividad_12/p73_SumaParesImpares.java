// p73_SumaParesImpares - Imprime pares o impares y su suma
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p73_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, char letra) {
        int suma = 0;
        
        for (int i = ini; i <= fin; i++) {
            if (letra == 'P') {
                System.out.printf("%d ", i);
                suma += i;
            } else if (letra == 'I') {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int ini, fin, suma;
        char poi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor incial? ");
        ini = sc.nextInt();
        System.out.print("Valor final? ");
        fin = sc.nextInt();

        System.out.print("\n[P]ares\n[I]Impares\n");
        poi = Character.toUpperCase(sc.next().charAt(0));

        suma = poi == 'P' ? SumaParImpar(ini % 2 == 0 ? ini : ini + 1, fin, 'P') : SumaParImpar(ini % 2 == 0 ? ini + 1 : ini, fin, 'I');

        System.out.printf("\nLa suma es : %d", suma);

        sc.close();
    }
}
