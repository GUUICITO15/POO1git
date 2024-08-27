// p29_Calculadora - Efectua operaciones matemáticas básicas con 2 número
// 26 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p29_Calculadora {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double n1, n2;
        char op;
        Scanner sc = new Scanner(System.in);

        System.out.println("Efectua operaciones matemáticas básicas con 2 número\n");

        System.out.print("Dame número 1 ? ");
        n1 = sc.nextDouble();
        System.out.print("Dame número 2 ? ");
        n2 = sc.nextDouble();

        System.out.print("Operación ( +, -, *, /, ^ ) ? ");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("n1 + n2 = %.2f", n1 + n2);
                break;
            case '-':
                System.out.printf("n1 - n2 = %.2f", n1 - n2);
                break;
            case '*':
                System.out.printf("n1 * n2 = %.2f", n1 * n2);
                break;
            case '/':
                System.out.printf("n1 / n2 = %.2f", n1 / n2);
                break;
            case '^':
                System.out.printf("n1 ^ n2 = %.2f", Math.pow(n1, n2));
                break;
            default:
                System.out.printf("\nOperación Inválida ...");
                break;
        }
        
        System.out.println("\n\nProceso terminado ...");
        sc.close();
    }
}
