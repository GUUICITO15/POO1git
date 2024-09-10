// pe01_PrimerExamenParcial - 
// 10 - 09 - 2024       v.1
// Luis Manuel Flores - POO1

import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        int edad, sumEdad = 0, rechazados = 0, hombres = 0, mujeres = 0, alumnos = 0, docentes = 0, trasbajadores = 0, totalRecaudado = 0, participantes, promEdad;
        char resp, tipoParticipante  = 'n', sexo;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Cual es tu nombre? ");
            nombre = sc.nextLine();

            do {
                System.out.print("Cual es tu edad? ");
                edad = sc.nextInt();
                sumEdad += edad;
            } while (edad < 0);

            if (edad >= 23) {
                do{
                    System.out.print("Tipo de participante (A)lumno, (D)ocente, (T)rabajador: ");
                    tipoParticipante = Character.toUpperCase(sc.next().charAt(0));

                    do{
                        System.out.print("Sexo (M)ujer, (H)ombre: ");
                        sexo = Character.toUpperCase(sc.next().charAt(0));

                        
                        switch (sexo) {
                            case 'M':
                                mujeres++;
                                break;
                            case 'H':
                                hombres++;
                                break;
                            default:
                                System.out.println("Responde H ó M, por favor\n");
                                break;
                        }
                    } while (sexo != 'H' && sexo != 'M');
                    
                    switch (tipoParticipante) {
                        case 'A':
                            alumnos++;
                            totalRecaudado += 40;
                            break;
                        case 'D':
                            docentes++;
                            totalRecaudado += 60;
                            break;
                        case 'T':
                            trasbajadores++;
                            totalRecaudado += 80;
                            break;
                        default:
                            System.out.println("Responde A, D ó T, por favor\n");
                            break;
                    }
                } while (tipoParticipante != 'A' && tipoParticipante != 'D' && tipoParticipante != 'T');

                System.out.print("Bienveido " + nombre + ", " + edad + " te inscribiste como ");

                switch (tipoParticipante) {
                    case 'A':
                        System.out.print("Alumno");
                        break;
                    case 'D':
                        System.out.print("Docente");
                        break;
                    case 'T':
                        System.out.print("Trabajador");
                        break;
                    default:
                        System.out.println("Responde A, D ó T, por favor\n");
                        break;
                }
            } else
                rechazados++;

            while (true){
                System.out.print("\nDeseas inscribir a alguien más (S/N)? ");
                resp = Character.toUpperCase(sc.next().charAt(0));
                if (resp == 'N' || resp == 'S'){
                    break;
                } else
                    System.out.println("responde con S (si) o N (no)");
            }
        } while (resp != 'N');

        participantes = (alumnos + docentes + trasbajadores);
        promEdad = sumEdad / participantes;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("total de:");
        System.out.println("Alumnos:       " + alumnos);
        System.out.println("Docentes:      " + docentes);
        System.out.println("Trabajadores:  " + trasbajadores);
        System.out.println("Hombres:       " + hombres);
        System.out.println("Mujeres:       " + mujeres);
        System.out.println("Participantes: " + participantes);
        System.out.println("Prom. edad:    " + promEdad);
        System.out.println("Rechazados: " + rechazados);
        System.out.println("---------------------------------");
        System.out.println("Recaudado:");
        System.out.println("Alumnos:       " + alumnos * 40);
        System.out.println("Docentes:      " + docentes * 60);
        System.out.println("Trabajadores:  " + trasbajadores * 80);
        System.out.println("Total:  " + totalRecaudado);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println();

        System.out.print("El evento concluye con ganancias ");
        if (totalRecaudado < 50)
            System.out.println("BAJAS");
        else if (totalRecaudado >= 50 && totalRecaudado <= 1000)
            System.out.println("MODERADAS");
        else if (totalRecaudado > 1000)
            System.out.println("BUENAS");
        
        System.out.println("\n\nProceso terminado...");
        sc.close();
    }
}
