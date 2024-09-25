// p90_Temperatura
// 24 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

public class p90_Temperaturas {
    public static void mostrar(float[] arreglo) {
        for(int i=0; i < arreglo.length; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }

    public static void ceroMayorA10(float[] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
            if (arreglo[i] > 10)
                arreglo[i] = 0;
    }
    
    public static void main(String[] args) {
        float[] temperaturas = { 2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f };
        
        System.out.println("Primer elemento " + temperaturas[0]);
        System.out.println("Tercer elemento " + temperaturas[2]);

        mostrar(temperaturas);
        ceroMayorA10(temperaturas);
        mostrar(temperaturas);

        System.out.println("Proceso Terminado....");
    }
}
