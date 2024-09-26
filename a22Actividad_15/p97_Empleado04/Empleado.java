package a22Actividad_15.p97_Empleado04;

public class Empleado {
    private String nombre;
    private int edad;
    private char sexo;
    private boolean casado;

    public Empleado() {};
    
    public Empleado(String nombre,int edad, char sexo, boolean casado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
    }

    public int getEdad() {
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public boolean getCasado() {
        return casado;
    }

        
    public String toString(){
        return String.format("Nombre: %s, Edad: %d, Sexo: %s, Casado: %s", nombre, edad, (sexo == 'M' ? "Mujer" : "Hombre"), (casado ? "Casado" : "No Casado"));
    }
}
