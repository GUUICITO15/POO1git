// p92_MayorMenor
// 24 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p92_MayorMenor {
    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
    
    public static int mayor(int[] arreglo) {
        int m = arreglo[0];

        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] > m)
                m = arreglo[i];

        return m;
    }

    public static int menor(int[] arreglo) {
        int m = arreglo[0];

        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] < m)
                m = arreglo[i];

        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        int cantidadNum;

        System.out.print("Cuantas numeros daras? ");
        cantidadNum = sc.nextInt();

        numeros = new int[cantidadNum];

        for (int i = 0; i < cantidadNum; i++) {
            System.out.print("dame el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        mostrar(numeros);

        System.out.println("\nel mayor: " + mayor(numeros));
        System.out.println("el menor: " + menor(numeros));

        sc.close();
    }
}
