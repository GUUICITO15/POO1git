// p84_LeerArregloCalificaciones - Lee un arreglo de n calificaciones, calcula al suma y el promedio
// 23 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int n=0;
        float suma = 0, promedio = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos calificaciones deseas procesar ? ");
        n = sc.nextInt();
        
        float[] califs = new float[n];
            System.out.printf("Introduce las %d calificaciones \n", n);
            
        for (int i = 0; i < califs.length; i++) {
            System.out.printf("Calificacion %d : ", i + 1);
            califs[i] = sc.nextFloat();
        }
        
        System.out.println("\nEl arreglo de calificaciones capturadas es :");
        for (float cal : califs) {
            System.out.printf("%.2f ", cal);
            suma = suma + cal;
        }
        
        promedio = suma / califs.length;

        System.out.printf("\nLa suma de las calificaciones es %.2f", suma);
        System.out.printf("\nEl promedio de las calificaciones es %.2f", promedio);

        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
