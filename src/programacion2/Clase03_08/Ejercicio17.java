/*
 Calcular el área y perímetro de un círculo.
La fórmula para calcular el PERIMETRO = 2 * PI * radio
La fórmula para calcular el AREA: A = PI * radio2
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio17 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double area, peri, r;
        double pi = 3.1416;
        System.out.println("Favor ingrese el radio: ");
        r = ingreso.nextDouble();
        peri = 2 * pi * r;
        area = pi * pow(r,2);
        
        System.out.println("Perimetro: " + peri);
        System.out.println("Area: " + area);
    }
}
