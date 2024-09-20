// p79_SumaMultiplos - suma de números múltiplos de 3 o múltiplos de 4 en el rango de números especificados.
// 18 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p79_SumaMultiplos {
    
    /**
     * identifica los multiplos de un numero dado entre dos numeros y los suma
     * @param limInf (int) limite inferior
     * @param limSup (int) limite superior
     * @param mult (int) numero del cual se buscaran sus multiplos
     * @return regresa la suma de los multiplos del mult (int)
     */
    public static int sumaMultiplos(int limInf, int limSup, int mult) {
        int sum = 0;

        System.out.println();

        for (int i = limInf; i <= limSup; i++) {
            if (i % mult == 0) {
                if (mult == 4)
                    System.out.printf("%d ", i);
                sum += i;
            }
        }
        System.out.println();
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        char resp;
        int ini, fin;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Valor inicial del rango: ");
            ini = sc.nextInt();
            System.out.print("Valor final del rango: ");
            fin = sc.nextInt();
        } while (!(ini < fin));

        do {
            System.out.println("\nElige el múltiplo:");
            System.out.println("1. Múltiplos de 3");
            System.out.println("2. Múltiplos de 4");
            System.out.print("Opción: ");
            resp = Character.toUpperCase(sc.next().charAt(0));

            switch (resp) {
                case '1':
                    System.out.println("Sumando múltiplos de 3 entre " + ini + " y " + fin);
                    System.out.println("suma: " + sumaMultiplos(ini, fin, 3));
                    break;
                case '2':
                    System.out.println("Sumando múltiplos de 4 entre " + ini + " y " + fin);
                    System.out.println("suma: " + sumaMultiplos(ini, fin, 4));
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (resp != '1' && resp != '2');

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
