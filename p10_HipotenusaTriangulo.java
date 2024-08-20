// p10_HipotenusaTriangulo - Calcula la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados
// 19 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double hipotenusa, longL1, longL2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la longitud de el primer lado: ");
        longL1 = sc.nextDouble();
        System.out.print("Dame la longitud de el segundo lado: ");
        longL2 = sc.nextDouble();

        hipotenusa = Math.sqrt(longL1 * longL1 + longL2 * longL2);

        System.out.println(String.format("La hipotenusa de el triangulo formado por los lados dados es: %.2f", hipotenusa));
        sc.close();
    }
}
