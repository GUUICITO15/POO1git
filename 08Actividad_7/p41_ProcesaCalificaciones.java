// p41_ProcesaCalificaciones - Procesa n calificaciones, calcula la suma y el promedio
// 28 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int n,c;
        float calif,suma, prom;
        Scanner sc = new Scanner(System.in);

        calif = suma = prom = 0;
        
        System.out.println("Procesa n calificaciones, calcula la suma y el promedio");

        System.out.print("¿Cuantas calificaciones quieres procesar? ");
        n = sc.nextInt();

        c = 1;
        while (c <= n) {
            System.out.printf("Calificacion %d: ", c++);
            calif = sc.nextFloat();
            suma = suma + calif;
        }
        
        prom = suma / n;

        System.out.printf("\nLa suma es: %.2f\n", suma);
        System.out.printf("El promedio es: %.2f\n", prom);

        sc.close();
    }
    
}
