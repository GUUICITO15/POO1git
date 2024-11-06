package a38Practica_14;

import java.util.ArrayList;
import r00ManejoArchivos_1.ManejoArchivos;
import java.util.Scanner;

public class p138_ArchivoMaterias {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        ArrayList<String> losDatos = new ArrayList<>();
        String arch = "a38Practica_14/Materias.txt";
        ManejoArchivos mArchivos = new ManejoArchivos();

        try {
            System.out.println("Introduce las materias cursadas\n");
            mArchivos.leerDatos(datos, new Scanner(System.in));

            mArchivos.grabarArchivo(arch, datos);
            losDatos = mArchivos.leerArchivo(arch);

            losDatos.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
