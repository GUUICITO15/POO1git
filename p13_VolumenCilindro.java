// p13_VolumenCilindro - Calcula el volumen de un cilindro dado su radio y altura
// 19 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double radio, altura, volumen;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el radio del cilindro: ");
        radio = sc.nextDouble();
        System.out.print("Dame la altura del cilindro: ");
        altura = sc.nextDouble();

        volumen = Math.PI * Math.pow(radio, 2) * altura;
        
        System.out.println(String.format("El volumen del cilindro segun la altura y radio dado es de: %.2f", volumen));
        sc.close();
    }
}
