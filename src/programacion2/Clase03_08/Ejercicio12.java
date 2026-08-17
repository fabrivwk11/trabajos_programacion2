/*
Calcular el área de una corona circular.
Area = PI * (Radio Mayor2 - Radio Menor2)
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio12 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double a, rM, rm;
        double pi = 3.1416;
        System.out.println("Favor ingrese el radio mayor: ");
        rM = ingreso.nextDouble();
        System.out.println("Favor ingrese el radio menor");
        rm = ingreso.nextDouble();
        a = pi * (pow(rM, 2) - pow(rm,2));
        System.out.println("El area de una corona es: " + a);
    }
}
    