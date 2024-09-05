// p48_ImparesAscendente - Imprime numeros impares ascendentes
// 03 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String [] args){
        int n, cont, sum, prom;
        char resp;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        
            System.out.println("Imprime números impares descendente\n");

            System.out.print("hasta donde? ");
            n = sc.nextInt();
            
            sum = 0;
            cont = 1;
            while (cont <= n) {
                System.out.printf("%d ", cont);
                sum = sum + cont;
                cont = cont + 2;
            }
            
            prom = sum / ((n % 2 == 0 ? n : ++n) / 2);

            System.out.printf("\nLa suma es %d", sum);
            System.out.printf("\nEl promedio es %d", prom);

            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(sc.next().charAt(0));
        } while (resp != 'N');
        
        System.out.println("\nGracias por utilizar este programa!");
        sc.close();
    }
}