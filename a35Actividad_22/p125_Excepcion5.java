package a35Actividad_22;

import java.util.Scanner;

public class p125_Excepcion5 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Que posición del arreglo deseas acceder ? ");
            int pos = sc.nextInt();

            System.out.println("La posición " + pos + ", contiene el valor de " + a[pos]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estas tratando de acceder una posición del arreglo fuera de límite");
            System.out.println("Mensaje del sistema : " + e);

        } finally {
            System.out.println("Los elementos que tiene el arreglo son:");

            for (int i : a) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
