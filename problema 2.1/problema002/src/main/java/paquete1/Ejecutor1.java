
package paquete1;

import java.util.Scanner;
import paquete3.Automotor;

public class Ejecutor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de iteraciones ");
        int iteracion = sc.nextInt();
        for(int i =0;i<iteracion;i++){
            System.out.println("Ingrese la informacion del automotor "+(i+1));
            System.out.println("Cedula del dueño");
            long cedula = sc.nextLong();
            System.out.println("Ingrese la marca del vehiculo");
            String marca = sc.next();
            System.out.println("Año de fabricacion");
            int año = sc.nextInt();
            System.out.print("Valor del vehículo: ");
            float valor = sc.nextFloat();
            Automotor auto1 = new Automotor(cedula,marca,año,valor);
            auto1.establecerValorMatricula();
            System.out.printf("%s\n", auto1);
        }
        
    }
}
  