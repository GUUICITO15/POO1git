package r00ManejoArchivos_1;

import java.io.*;
import java.util.ArrayList;

public class SerealizadoObjetos {
    public static void serializarDatos(String archivo, ArrayList<Object> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);

        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Object> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Object> datos;

        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);

        datos = (ArrayList<Object>) fpersonas.readObject();

        fpersonas.close();

        return datos;
    }
}
