// p54_ArribaAbajo - De 1 a n y de n a 1, según el usuario lo decida
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p54_ArribaAbajo {
    public static void main(String[] args) {
        int n, op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        
            System.out.println("Numeros de 1 a n .... [ 1 ]");
            System.out.println("Numeros de n a 1 .... [ 2 ]");
            System.out.println("Salir ............... [ 3 ]");
            System.out.print("Elije? ");
            op = sc.nextInt();
            
            switch(op) {
                case 1:
                    System.out.print("Hasta donde? ");
                    n = sc.nextInt();
                    
                    for(int i=1; i<=n; i++)
                        System.out.printf("%d ", i);
                        
                    break;
                case 2:
                    System.out.print("Desde donde? ");
                    n = sc.nextInt();
                    
                    for(int i=n; i>=1; i--)
                        System.out.printf("%d ", i);
                        
                    break;
                case 3:
                    System.out.println("\nTe vas por que quieres nadie te corre");
                    break;
                default:
                    System.out.println("\nOpcion Invalida");
                    break;
            }
            System.out.println("\nPresiona <Enter> para continuar");
            sc.nextLine();sc.nextLine();
            
        } while (op != 3);
        
        System.out.println("\nProceso Terminado....");
        sc.close();
    }
}
