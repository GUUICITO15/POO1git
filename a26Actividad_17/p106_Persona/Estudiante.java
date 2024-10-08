package a26Actividad_17.p106_Persona;

public class Estudiante extends Persona {
    private String Carrera;
    private int Anio;
    private double Colegiatura;

    public Estudiante() {}

    public Estudiante(String nombre, String direccion, String carrera, int anio, double colegiatura) {
        super(nombre, direccion);
        Carrera = carrera;
        Anio = anio;
        Colegiatura = colegiatura;
    }
    

    public Estudiante(Persona persona, String carrera, int anio, double colegiatura) {
        super(persona.Nombre, persona.Direccion);
        Carrera = carrera;
        Anio = anio;
        Colegiatura = colegiatura;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public double getColegiatura() {
        return Colegiatura;
    }

    public void setColegiatura(double colegiatura) {
        Colegiatura = colegiatura;
    }

    @Override
    public String toString() {
        return "Estudiante[" + super.toString() + ",Carrera=" + Carrera + ", Anio=" + Anio + ", Colegiatura=" + Colegiatura + "]";
    }
}
