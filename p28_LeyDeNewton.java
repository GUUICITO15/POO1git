// p27_AceptarEstudiante - Acepta a un estudiante en base a su edad y sus calificaciones
// 22 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p28_LeyDeNewton {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        float f, m, a;
        char op;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcula la segunda ley de newton\n\n¿que quieres calcular?");

        System.out.println("[F]uerza ( f=m*a ) ");
        System.out.println("[M]asa ( m=f/a ) ");
        System.out.println("[A]celeracion ( a=f/m ) ");
        System.out.print("Elije una opcion:\n");
        op = Character.toUpperCase(sc.next().charAt(0));

        f = m = a = 0;
        if (op == 'F') {
            System.out.println("\nCalculando la Fuerza...");

            System.out.print("¿cual es la masa? ");
            m = sc.nextFloat();
            System.out.print("¿cual es la aceleracion? ");
            a = sc.nextFloat();

            f = m * a;
            System.out.printf("\nLa fuerza es: %.2f", f);

        } else if (op == 'M') {
            System.out.println("\nCalculando la Masa ...");

            System.out.print("¿cual es la fuerza? ");
            f = sc.nextFloat();
            System.out.print("¿cual es la aceleracion? ");
            a = sc.nextFloat();

            m = f / a;
            System.out.printf("\nLa masa es: %.2f", m);

        } else if (op == 'A') {
            System.out.println("\nCalculando la Aceleracion ...");

            System.out.print("¿cual es la fuerza? ");
            f = sc.nextFloat();
            System.out.print("¿cual es la masa? ");
            m = sc.nextFloat();

            a = f / m;
            System.out.printf("\nLa aceleración es: %.2f", a);

        } else
            System.out.println("\nOpcion Invalida \n");
        
        System.out.println("\nProceso terminado ...");
        sc.close();
    }
}
