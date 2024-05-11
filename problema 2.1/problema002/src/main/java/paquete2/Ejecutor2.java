
package paquete2;

import java.util.Scanner;
import paquete3.Automotor;


public class Ejecutor2 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean continuar = true ;
       while(continuar){
           System.out.println("Cedula: ");
           long cedula=sc.nextLong();
            System.out.println("Ingrese los detalles del automotor:");         
            System.out.print("Marca del vehículo: ");
            String marca = sc.next();
            System.out.print("Año de fabricación: ");
            int año = sc.nextInt();
            System.out.print("Valor del vehículo: ");
            float valor = sc.nextFloat();
             Automotor automotor = new Automotor(cedula, marca, año, valor);
            automotor.establecerValorMatricula();
            
     

            System.out.print("¿Desea ingresar otro automotor? (s/n): ");
            String respuesta = sc.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("Resultados:");
      

        // Añadimos un mensaje para demostrar que el programa sigue ejecutándose después del bucle
        System.out.println("El programa sigue ejecutándose después del bucle while.");

        sc.close();
    }
}