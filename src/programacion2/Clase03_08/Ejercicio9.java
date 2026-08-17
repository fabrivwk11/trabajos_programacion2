/*
Escribir un programa que pida la altura y el diámetro de un cilindro en metros. Calcular el
volumen del cilindro y mostrar el resultado.
La fórmula para calcular el volumen de un cilindro es: V = Pi * radio2
* altura.
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio9 {
    public static void main(String[]args){
        Scanner ingreso= new Scanner(System.in);
        double h, d, v, r;
        double pi = 3.1416;
        System.out.println("Favor ingrese la altura del cilindro: ");
        h = ingreso.nextDouble();
        System.out.println("Favor ingrese el diametro del cilindro: ");
        d = ingreso.nextDouble();
        r = d / 2;
        v = pi * pow(r,2);
        System.out.println("El volumen del cilindro es: " + v);
    }
}
