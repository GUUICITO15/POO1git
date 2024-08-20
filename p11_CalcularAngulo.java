// p11_CalcularAngulo - Calcula el tercer angulo de un triángulo dados los otros dos angulos
// 19 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double angulo1, angulo2, angulo3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer angulo del triangulo: ");
        angulo1 = sc.nextDouble();
        System.out.print("Dame el segundo angulo del triangulo: ");
        angulo2 = sc.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("El tercer angulo de el triangulo formado por los angulos dados es: %.1f°", angulo3));
        sc.close();
    }
}
