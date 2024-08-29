// p43_ConteoNumeros - Cuenta números: postivos, negativos, ceros, hasta introducir 999
// 28 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p43_ConteoNumeros {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int n = 0, c = 0, s = 0, cp = 0, cn = 0, cc = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuenta números: postivos, negativos, ceros, hasta introducir 999\n");

        do {
            System.out.print("Dame un numero: "); n = sc.nextInt();
            if( n != 999) {
                c++;
                s = s + n;

                if (n > 0)
                    cp++;
                else if (n < 0)
                    cn++;
                else
                    cc++;
            }
        } while (n != 999);
        
        System.out.println("\nCaptura terminada");
        System.out.println("\nResumen:");
        System.out.printf("Introdujiste %d numeros \n",c);
        System.out.printf("La suma de los numeros es : %d \n",s);
        System.out.printf("Los positivos fueron : %d \n", cp);
        System.out.printf("Los negativos fueron : %d \n", cn);
        System.out.printf("Los ceros fueron : %d \n", cc);
        
        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
