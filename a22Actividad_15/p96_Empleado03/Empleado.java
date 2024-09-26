package a22Actividad_15.p96_Empleado03;

public class Empleado {
    private String nombre;
    private int edad;
    
    public Empleado() {};
    
    public Empleado(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
        
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public String toString(){
        return String.format("Nombre: %s, Edad: %d", nombre, edad);
    }
}
