package a35Actividad_22;

import java.io.File;
import java.util.Scanner;

public class p126_Excepcion6 {
    public static void main(String[] args) {
        File nombres = new File("nombres.txt");

        try {
            Scanner sc = new Scanner(nombres);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
            sc.close();

        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo ..");
        }
    }
}