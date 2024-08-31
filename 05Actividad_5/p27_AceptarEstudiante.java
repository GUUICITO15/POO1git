// p27_AceptarEstudiante - Acepta a un estudiante en base a su edad y sus calificaciones
// 22 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        String nombre;
        int edad;
        float c1,c2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Se aceptara al estudiante en base a su edad y sus calificaciones\n");

        System.out.print("¿Dame tu nombre? ");
        nombre = sc.nextLine();
        System.out.print("¿Dame la edad al iniciar el curso? ");
        edad = sc.nextInt();
        
        if( edad >= 18 ) {
            System.out.println("Eres mayor de edad, continuamos ");

            System.out.println("Dame dos calificaciones separadas por Enter:");
            c1 = sc.nextFloat();
            c2 = sc.nextFloat();

            if( c1 >= 8 && c2 >= 8)
                System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,c1,c2);
            else
                System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");

        } else
            System.out.println("\nSolo aceptamos estudiantes mayores de edad");

        System.out.println("\nProceso terminado ...");
        sc.close();
    }
}