// p56_SumaPromedio - Suma y promedio de n calificaciones
// 4 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        char resp;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            suma = prom = 0;
            
            System.out.println("Suma y promedio de n calificaciones: \n");

            System.out.print("Cuantas calificaciones? ");
            n = sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
                System.out.printf("Calificacion %d? ", i);
                cal = sc.nextFloat();
                suma += cal;
            }
            
            prom=suma/n;
            System.out.printf("\nSuma es %.2f y el promedio es %.2f\n\n", suma, prom);
            
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
