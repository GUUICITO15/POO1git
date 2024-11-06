package a38Practica_14;

import java.util.ArrayList;
import java.util.Arrays;
import r00ManejoArchivos_1.ManejoArchivos;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>(Arrays.asList("Fútbol", "Béisbol", "Ciclismo", "Atletimso", "Natación", "Motociclismo"));
        ArrayList<String> losDatos = new ArrayList<>();
        String arch = "a38Practica_14/Deportes.txt";
        ManejoArchivos mArchivos = new ManejoArchivos();

        try {
            mArchivos.grabarArchivo(arch, datos);
            System.out.println("\nLos datos han sido escritos.\n");
            
            losDatos = mArchivos.leerArchivo(arch);

            losDatos.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}