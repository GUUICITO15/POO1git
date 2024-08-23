// p26_TipoAngulo - Muestra el tipo de angulo según los grados
// 22 - 08 - 2024       v.1.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int angulo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Muestra el tipo de ángulo \n");

        System.out.print("Dame un ángulo entre 0 y 360 grados? ");
        angulo = sc.nextInt();

        System.out.print("El ángulo que introdujiste: ");

        if (angulo > 360 || angulo < 0)
            angulo = angulo % 360;
        if (angulo < 0)
            angulo = angulo + 360;


        if(angulo < 90)
            System.out.println("Es agudo");

        else if(angulo == 90)
            System.out.println("Es recto");

        else if(angulo > 90 && angulo < 180)
            System.out.println("Es obtuso");

        else if(angulo == 180)
            System.out.println("Es llano");

        else if(angulo > 180 && angulo < 360)
            System.out.println("Es concavo");

        else if(angulo == 360)
            System.out.println("Es completo");
        
        System.out.println("\nProceso terminado....");
        sc.close();
    }
}
