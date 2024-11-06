package a38Practica_14.p139_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private String Nombre;
    private int Edad;
    private double Promedio;
    private char Sexo;

    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        Nombre = nombre;
        Edad = edad;
        Promedio = promedio;
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return Nombre + "," + Edad + "," + Promedio + "," + Sexo ;
    }
}
