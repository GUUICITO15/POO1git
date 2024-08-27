// p07_OperadoresAsignacion - hace diferntes operaciones a una misma variable
// 15 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p07_OperadoresAsignacion {
    
    public static void main(String[] args){
        System.out.print("\033[2J\033[H");
        System.out.flush();

        float num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num = sc.nextInt();

        System.out.printf("El numero original es : %.2f \n", num);
        System.out.printf("Incremantar 1 : %.2f \n", ++num);
        System.out.printf("Sumar 80 : %.2f \n", num+=80);
        System.out.printf("Restar 35 : %.2f \n", num-=35);
        System.out.printf("Multiplicar por 15 : %.2f \n", num*=15);
        System.out.printf("Dividir entre 4 : %.2f \n", num/=4);
        System.out.printf("Decrementar 1 : %.2f \n", --num);

        sc.close();
    }
}