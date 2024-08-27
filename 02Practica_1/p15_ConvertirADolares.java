// p15_ConvertirADolares - Dada una cantidad de pesos se desea conocer el equivalentye a dolares. 
// 19 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double peso, dolar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame los pesos a convertir: ");
        peso = sc.nextDouble();

        dolar = peso * 0.054;

        System.out.println(String.format("$%.1f pesos equivalen a %.2f dolares, a dia de 19 - 08 - 2024.", peso, dolar));
        sc.close();
    }
}
