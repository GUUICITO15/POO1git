package r00ManejoArchivos_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManejoArchivos {
    public void leerDatos(ArrayList<String> datos, Scanner sc) {
        String dato = "";

        System.out.println("Introduce un dato presiona <Enter> dato vacio para terminar> ");

        while (true) {
            dato = sc.nextLine();

            if (!dato.isEmpty())
                datos.add(dato);
            else
                break;
        }
    }

    public void grabarArchivo(String archivo, ArrayList<String> datos) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));

        for (String dato : datos)
            fdatos.write(dato + "\n");

        fdatos.close();
    }

    public ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;

        while ((dato = fdatos.readLine()) != null)
            datos.add(dato);

        fdatos.close();
        return datos;
    }
}
