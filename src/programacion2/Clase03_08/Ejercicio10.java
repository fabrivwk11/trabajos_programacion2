/*
10. Escribir un programa que calcule el área y perímetro de un triángulo equilátero.
La fórmula para calcular el PERIMETRO = lado x 3
La fórmula para calcular el AREA = (lado2 * √3) /4
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio10 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner (System.in);
        double lado, area, peri;
        System.out.println("Favor ingrese el lado del triangulo: ");
        lado = ingreso.nextDouble();
        peri = lado * 3;
        area = (pow(lado,2) * sqrt(3))/ 4;
        System.out.println("El area del equilatero es: " + area);
        System.out.println("El perimetro del equilatero es: " + peri);
    }
}
