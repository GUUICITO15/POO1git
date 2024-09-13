// p72_SumaDigitos - Suma los digitos de un numero entero
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p72_SumaDigitos {
    public static int SumaDigitos(int n) {
        int suma = 0, digito;

        while (n != 0) {
            digito = n % 10;
            n = n / 10;
            suma += digito;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un número? ");
        numero = sc.nextInt();
        
        System.out.printf("\nLa suma de digitos es: %d", SumaDigitos(numero));
        
        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
