/*
13. Calcular el área de un tetraedro.
Area = √3 * a2      (a = arista)
 */
package Clase03_08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio13 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double a,area;
        System.out.println("Favor ingrese la arista: ");
        a = ingreso.nextDouble();
        area = sqrt(3) * pow(a,2);
        System.out.println("El area de un tetraedro es : " + area);
    }
}
