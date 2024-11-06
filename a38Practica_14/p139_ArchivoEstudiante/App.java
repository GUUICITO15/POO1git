package a38Practica_14.p139_ArchivoEstudiante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import r00ManejoArchivos_1.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Object> estudiantes = new ArrayList<>();
        ArrayList<String> estudiantesStrings = new ArrayList<>();
        ManejoArchivos mArchivos = new ManejoArchivos();
        String archivo = "a38Practica_14/p139_ArchivoEstudiante/Estudiantes";

        estudiantes.add(new Estudiante("Juan Perez", 17, 8.7, 'M'));
        estudiantes.add(new Estudiante("Maria del Rosario", 16, 6.6, 'F'));
        estudiantes.add(new Estudiante("Miranda Cazimiro", 17, 9.4, 'F'));
        estudiantes.add(new Estudiante("Raul Saucedo", 18, 7.9, 'M'));

        try {
            SerealizadoObjetos.serializarDatos(archivo + ".dat", estudiantes);

            estudiantes.forEach(n -> estudiantesStrings.add(n.toString()));
            mArchivos.grabarArchivo(archivo + ".txt", estudiantesStrings);

        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }

        try {
            ArrayList<Object> estudiantesDat = SerealizadoObjetos.desSerializarDatos(archivo + ".dat");
            
            System.out.println("\nLos datos leidos del archivo dat son:\n");
            estudiantesDat.forEach(n -> System.out.println(n));

        } catch (Exception e) {
            System.out.println("Problemas al preocesar el archivo.." + e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo + ".txt"))) {
            String linea;
            ArrayList<Object> estudiantesTxt = new ArrayList<>();

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                estudiantesTxt.add(new Estudiante(partes[0], Integer.parseInt(partes[1]), Double.parseDouble(partes[2]), partes[3].charAt(0)));
            }

            System.out.println("\nLos datos leidos del archivo txt son:\n");
            estudiantesTxt.forEach(n -> System.out.println(n));

            
        } catch (Exception e) {
            System.out.println("Problemas al preocesar el archivo.." + e);
        }
    }
}
