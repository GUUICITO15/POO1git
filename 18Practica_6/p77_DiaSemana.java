// p77_DiaSemana - pide un número entero entre 1 y 7 y devuelva el día de la semana con letra.
// 18 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p77_DiaSemana {
    
    /**
     * Recibe un numero y da el equivalente de la semana empendo por lunes y 1
     * @param dia (int) valor numerico entre 1 y 7 represtentante de un día de la semana empezando por lunes
     * @return el dia que se proporcviono en numero pero en palabra (String)
     */
    public static String day(int dia) {
        String diaLetras = "";

        switch (dia) {
            case 1:
                diaLetras = "Lunes";
                break;
            case 2:
                diaLetras = "Martes";
                break;
            case 3:
                diaLetras = "Miércoles";
                break;
            case 4:
                diaLetras = "Jueves";
                break;
            case 5:
                diaLetras = "Viernes";
                break;
            case 6:
                diaLetras = "Sábado";
                break;
            case 7:
                diaLetras = "Domingo";
                break;
        }

        return diaLetras;
    }
    
    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dado un numero entre 1 y 7 imprime el dia de la semana\n");

        do {
            System.out.print("Dame el día con número? ");
            dia = sc.nextInt();

            if (dia < 1 || dia > 7)
                System.out.println("Día inválido, en que día vives");
        } while (dia < 1 || dia > 7);

        System.out.println(day(dia));

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}