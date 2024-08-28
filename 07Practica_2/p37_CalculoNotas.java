// p37_CalculoNotas - calcula el promedio de 5 calificaciones dadas
// 27 - 08 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;
import java.util.ArrayList;

public class p37_CalculoNotas {
    public static void main(String [] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Float auxCalif, promedio;
        ArrayList<Float> calificaciones = new ArrayList<Float>();
        int promedioInt, contadorCalif = 0;
        Scanner sc = new Scanner(System.in);
        
        while (contadorCalif < 5) {
            System.out.printf("Dame la calificación %d: ", (contadorCalif + 1));
            auxCalif = sc.nextFloat();

            if (auxCalif >= 0 && auxCalif <= 10) {
                calificaciones.add(auxCalif);
                contadorCalif++;
            } else {
                System.out.println("calificación invalida, por favor que sea un valor del 0 al 10");
            }
        }
        
        contadorCalif = 1;
        for (Float calif : calificaciones) {
            System.out.printf("calificación %d: %.2f\n", contadorCalif, calif);
            contadorCalif++;
        }
        
        promedio = (calificaciones.get(0) + calificaciones.get(1) + calificaciones.get(2) + calificaciones.get(3) + calificaciones.get(4)) / 5;
        System.out.printf("\nPromedio: %.2f\n", promedio);

        if (promedio >= 0 && promedio <= 6)
            promedioInt = 6;
        else if (promedio == 10)
            promedioInt = (int) Math.floor(promedio);
        else
            promedioInt = ((int) Math.floor(promedio) + 1);

        switch (promedioInt) {
            case 6:
                System.out.println("\nQuedas reprobado");
                break;
            case 7:
                System.out.println("\nPasas de panzazo");
                break;
            case 8:
                System.out.println("\nMuy bien, puedes mejorar");
                break;
            case 9:
                System.out.println("\nExcelente sigue así");
                break;
            case 10:
                System.out.println("\nPerfecto tu esfuerzo valió la pena");
                break;
        }
        
        sc.close();
    }
}
