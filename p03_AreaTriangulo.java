// p03_AreaTriangulo - Calcula el area de un triangulo
// 14 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCalculando el área de un triángulo:\n");
        System.out.print("Dame la base: ");
        base = sc.nextInt();
        System.out.print("Dame la altura: ");
        altura = sc.nextInt();

        area = (base * altura) / 2;

        System.out.println("Para un triángulo de base " + base + " y altura de " + altura +", el área es: " + area);
        System.out.println(String.format("Para un triángulo de base %d y una altura de %d el area es %.2f",base,altura,area));
    }
}
