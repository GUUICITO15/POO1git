package a24Actividad_16.p102_AutorLibro;

public class Autor {
    private String Nombre, correo;
    private int Edad;
    
    public Autor() {}

    public Autor(String nombre, String correo, int edad) {
        Nombre = nombre;
        this.correo = correo;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Autor [Nombre=" + Nombre + ", correo=" + correo + ", Edad=" + Edad + "]";
    }
}
