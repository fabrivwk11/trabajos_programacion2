/*
Escribir un programa que calcule el volumen de un cubo cuyo lado se ingresa por teclado.
La fórmula para calcular el volumen de un cubo es: V = lado3
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio8 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double lado,v; 
        System.out.println("Ingrese el lado de cubo: ");
        lado = ingreso.nextDouble();
        v = pow(lado,3);
        System.out.println("El volumen de cubo es: " + v);
    }
}
