// p23_ConvertirTemperaturas - Convertir temperatura de grados celcius a farenheit y viceversa
// 21 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p23_ConvertirTemperaturas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        char op;
        float temp, res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Convertir de grados celcius a farenheit y viceversa\n");

        System.out.println("[F]arenheit a Centigrados");
        System.out.println("[C]entigrados a Farenheit ");
        
        System.out.print("Elije una opcion? ");
        op = sc.next().charAt(0);
        op = Character.toUpperCase(op);

        if( op=='F' ) {
            System.out.println("\nConvertir de Farenheit a Centigrados\n");
            System.out.print("Dame los grados Farenheit? ");
            temp = sc.nextFloat();
            
            res = ( temp - 32 ) * 5 / 9;
            System.out.printf("%.2f Farenheit, equivale a %.2f Centigrados", temp, res);
        }
        else {
            System.out.println("\nConvertir de Centigrados a Farenheit\n");
            System.out.print("Dame los grados Centigrados? ");
            temp = sc.nextFloat();

            res = (temp * 9 / 5) + 32;
            System.out.printf("%.2f Centigrados, equivale a %.2f Farenheit", temp, res);
        }
        
        System.out.println("\n\nGracias por utilizar este programa");
        sc.close();
    }
}
