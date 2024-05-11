package Paquete1;

import java.util.Scanner;
import paquete2.LibretaNotas;

public class ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Crear objeto con calificacion de dos materias  ");
            System.out.println("2. Crear objeto con calificacion de tres materias");
            System.out.println("0. Salir");
            System.out.println("Ingrese una Opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante");
                    
                    sc.nextLine();
                    String nom = sc.nextLine();
                    System.out.println("Ingrese la calificacion de la materia 1:");
                    double cali1 = sc.nextDouble();
                    System.out.print("Ingrese la calificación de la materia 2: ");
                    double cali = sc.nextDouble();
                    LibretaNotas libreta1 = new LibretaNotas(nom, cali1, cali);
                    libreta1.establecerPromedio();
                    System.out.printf("%s\n", libreta1);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre2 = sc.next();
                    System.out.print("Ingrese la calificación de la materia 1: ");
                    double calif1_2 = sc.nextDouble();
                    System.out.print("Ingrese la calificación de la materia 2: ");
                    double calif2_2 = sc.nextDouble();
                    System.out.print("Ingrese la calificación de la materia 3: ");
                    double calif3_2 = sc.nextDouble();

                    LibretaNotas libreta2 = new LibretaNotas(nombre2, calif1_2, calif2_2, calif3_2);
                    libreta2.establecerPromedio();
                    System.out.printf("%s\n", libreta2);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;

            }
        } while (opcion != 0);
        sc.close();
    }

}
