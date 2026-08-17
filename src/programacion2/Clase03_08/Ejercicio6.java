/*
Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las
convierta a grados Celsius mostrándola. La conversión de grados Farenheit (F) a Celsius
(C) está dada por C = 5/9*(F − 32).
 */
package programacion2.Clase03_08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double fh;
        double c;
        System.out.println("Ingrese los grados en Fahrenheit: ");
        fh = ingreso.nextDouble();
        c= (fh - 32) * 5 / 9;
        System.out.println("El grado en Celsius es: " + c);
    }
}
