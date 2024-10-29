package a35Actividad_22;

import java.util.Scanner;
import java.util.InputMismatchException;

public class p124_Excepcion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Valor del numerador : ");
            int a = sc.nextInt();
            System.out.print("Valor del denominador : ");
            int b = sc.nextInt();
            
            int c = a / b;
            System.out.println("El resultado es " + c);

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Los valores debe ser numéricos y el denominador diferente de 0");
            System.out.println("Mensaje del sistema: " + e);
        }

        sc.close();
    }
}
