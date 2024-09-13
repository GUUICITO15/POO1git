// p75_CuadroCaracter - Imprime un cuadro de r x c del caracter especificado, usando una función
// 11 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p75_CuadroCaracter {
    public static void Cuadro(int ren, int col, char car) {
        for (int i = 1; i <= ren; i++) {
            for (int j = 1; j <= col; j++)
                System.out.printf("%c ", car);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int ren, col;
        char car;
        Scanner sc = new Scanner(System.in);

        System.out.print("Renglones ? ");
        ren = sc.nextInt();
        System.out.print("Columnas ? ");
        col = sc.nextInt();

        System.out.print("Caracter ? ");
        car = Character.toUpperCase(sc.next().charAt(0));

        Cuadro(ren, col, car);
        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
