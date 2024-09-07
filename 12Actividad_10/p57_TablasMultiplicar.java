// p57_TablasMultiplicar - Tablas de multiplicar de 1 a n hasta la del n
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        int i,j,n,m;
        char resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.print("Hasta que tabla? ");
            n = sc.nextInt();
            
            System.out.print("Hasta donde? ");
            m = sc.nextInt();
            
            for (i = 1; i <= n; i++) {
                System.out.printf("Tabla del %d\n", i);
                for (j = 1; j <= m; j++) {
                    System.out.printf("%d x %d = %d\n", i, j, i * j);
                }
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
