package a22Actividad_15.p94_Empleado01;

public class App {
    public static void main(String[] args) {
        // Instanciar y reservar espacio en memoria
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Juan Perez";
        empleado1.edad = 35;
        System.out.println(empleado1.toString());
        
        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.nombre = "Maria de Jesus";
        empleado2.edad = 16;
        System.out.println(empleado2.toString());
        // Accede elementos individuales directamente

        System.out.println("Nombre : " + empleado1.nombre);
        System.out.println("Edad : " + empleado1.edad);
    }
}
