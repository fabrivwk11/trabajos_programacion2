/*
14. Calcular el área de un ortoedro.
Area = 2 * (a*b + a*c + b*c)
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio14 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double a, b, c, area;
        System.out.println("Favor ingrese a: ");
        a = ingreso.nextDouble();
        System.out.println("Favor ingrese b");
        b = ingreso.nextDouble();
        System.out.println("Favor ingrese c");
        c = ingreso.nextDouble();
        area = 2 * (a*b + a*c + b*c);
        System.out.println("El area de una corona es: " + area);
    }
}
