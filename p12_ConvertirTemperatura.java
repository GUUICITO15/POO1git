// p12_ConvertirTemperatura - Convirte una temperatura de grados fahrenheit a grados celsius
// 19 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la temperatura en fahrenheits: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) * (5.0/9.0);

        System.out.println(String.format("La temperatura en celcius es de: %.2f °C", celsius));
        sc.close();
    }
}
