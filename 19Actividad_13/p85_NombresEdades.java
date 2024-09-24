// p85_NombresEdades - Leer un arreglo de n nombres y edades, calcula el promedio de edades
// 23 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p85_NombresEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int n, s=0,p=0;
        Scanner sc = new Scanner(System.in);
        String[] nombres;
        int[] edades;
        
        System.out.print("Cuantos nombres deseas procesar ? ");
        n = sc.nextInt();
        
        nombres = new String[n];
        edades = new int[n];

        System.out.printf("Dame los %d nombres: \n", n);
        for (int i = 0; i < nombres.length; i++) {
            sc.nextLine();
            System.out.printf("Dame el nombre %d ? ", i + 1);
            nombres[i] = sc.nextLine();
            System.out.printf("Dame su edad ? ", i + 1);
            edades[i] = sc.nextInt();
        }
        
        System.out.println("Los nombres capturados son:\n");

        System.out.printf("Nombre\tEdad\n");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%s\t%d\n", nombres[i], edades[i]);
            s += edades[i];
        }
        
        p = s / edades.length;

        System.out.printf("\nEl promedio de edades es %d", p);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
