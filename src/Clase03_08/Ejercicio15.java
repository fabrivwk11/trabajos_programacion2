/*
Calcular el área y perímetro de un rectángulo.
La fórmula para calcular el PERIMETRO = 2 * h + 2 * b.
La fórmula para calcular el AREA: A = b * h
 */
package Clase03_08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio15 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        int area, peri, h, b;
        System.out.println("Favor ingrese la altura: ");
        h = ingreso.nextInt();
        System.out.println("Favor ingrese la base: ");
        b = ingreso.nextInt();
        peri = 2 * h + 2 * b;
        area = b * h;
        
        System.out.println("Perimetro: " + peri);
        System.out.println("Area: " + area);
    }
}
