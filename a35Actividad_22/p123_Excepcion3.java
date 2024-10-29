package a35Actividad_22;

import java.util.Scanner;
import java.util.InputMismatchException;

public class p123_Excepcion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Valor del numerador : ");
            int a = sc.nextInt();
            
            System.out.print("Valor del denominador : ");
            int b = sc.nextInt();
            
            int c = a / b;
            System.out.println("El resultado es " + c);

        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0");
            
        } catch (InputMismatchException e) {
            System.out.println("Numerador y Denominador deben ser números enteros");
        }

        sc.close();
    }
}
