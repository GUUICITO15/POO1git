// p63_SumaTerminos1 - Suma de n términos entre 1
// 05 - 09 - 2024       v.2
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        int num;
        float sum;
        char resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.print("Cuantos números? ");
            num = sc.nextInt();
            
            sum = 0;
            for (int i = 1; i <= num; i++) {
                System.out.printf(" 1 / %d", i);
                sum += (1.0f / i);

                if (i != num)
                    System.out.print(" +");
            }
            
            System.out.printf(" = %,.2f\n", sum);
            
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
