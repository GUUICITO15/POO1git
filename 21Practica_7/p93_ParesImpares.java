// p93_ParesImpares
// 24 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;
import java.util.Random;

public class p93_ParesImpares {
    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
    
    public static int impares(int[] arreglo) {
        int sumImp = 0;

        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] % 2 != 0) {
                System.out.print(arreglo[i] + " ");
                sumImp++;
            }

        return sumImp;
    }

    public static int pares(int[] arreglo) {
        int sumPares = 0;

        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] % 2 == 0){
                System.out.print(arreglo[i] + " ");
                sumPares++;
            }

        return sumPares;
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = Math.abs(rnd.nextInt(20));
        }

        mostrar(numeros);

        System.out.println("\nhay " + pares(numeros) + " pares");
        System.out.println("\nhay " + impares(numeros) + " impares");

        sc.close();
    }
}
