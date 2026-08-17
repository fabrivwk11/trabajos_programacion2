/*
 Escribir un programa que calcule el volumen de una esfera cuyo valor del diámetro se
ingresa por teclado.
La fórmula para calcular el volumen de una esfera es: V = 4/3.π.r3
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio7 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double v,d,r;
        double pi = 3.1416;
        System.out.println("Favor ingrese el diametro: ");
        d=ingreso.nextDouble();
        r= d/2;
        v= 4/3 * pi * pow(r,3);
        System.out.println("El volumen de la esfera es: " + v);
    }
}
