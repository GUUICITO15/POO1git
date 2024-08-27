// p02_AreaCirculo - Calcula el area de un circulo
// 14 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p02_AreaCirculo{

    public static void main(String[] args) {
        double radio, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Calculando el area de un circulo \n");
        System.out.print("Dame el radio: ");
        radio = sc.nextFloat();

        area = Math.PI*Math.pow(radio,2);

        System.out.println("El circulo de radio " + radio + " tiene un area de: " + area);
        sc.close();
    }
}
