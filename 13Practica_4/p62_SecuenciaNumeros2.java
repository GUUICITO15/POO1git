// p62_SecuenciaNumeros2 - Imprime una pirámide del numero de columna
// 05 - 09 - 2024       v.2
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p62_SecuenciaNumeros2{
    public static void main(String[] args) {
        int numReglones;
        char resp;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Cuantos renglones? ");
            numReglones = sc.nextInt();

            for(int i=1; i<=numReglones; i++) {
                for(int j=1; j<=i; j++) {
                    System.out.printf("%-" + (String.valueOf(numReglones).length() + 1) + "d", j);
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
