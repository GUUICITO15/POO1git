// p91_MayoresPromedio
// 24 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void mostrar(float[] arreglo) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Calificaciones capturadas\n");

        for (int i = 0; i < arreglo.length; i++)
            System.out.println("calificación " + (i + 1) + ": " + arreglo[i]);
    }
    
    public static float suma(float[] arreglo) {
        float sum = 0;

        for (int i = 0; i < arreglo.length; i++)
            sum += arreglo[i];

        return sum;
    }

    public static float promedio(float[] arreglo) {
        return suma(arreglo) / arreglo.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] calificaciones;
        int cantidadCalif;

        System.out.print("Cuantas calificaciones daras? ");
        cantidadCalif = sc.nextInt();

        calificaciones = new float[cantidadCalif];

        for (int i = 0; i < cantidadCalif; i++) {
            System.out.print("dame la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextFloat();
        }

        mostrar(calificaciones);

        System.out.println("la suma de las calificaciones es: " + suma(calificaciones));
        System.out.println("el promedio de las calificaciones es: " + promedio(calificaciones));

        System.out.println("Proceso Terminado....");
        sc.close();
    }
    
}
