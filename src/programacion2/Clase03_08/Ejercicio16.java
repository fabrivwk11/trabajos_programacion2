/*
 Calcular el área y perímetro de un cuadrado.
La fórmula para calcular el PERIMETRO = lado * 4.
La fórmula para calcular el AREA: A = lado2
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio16 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        int area, peri, lado;
        System.out.println("Favor ingrese el lado: ");
        lado = ingreso.nextInt();
        peri = lado * 4;
        area = (int) pow(lado,2);
        
        System.out.println("Perimetro: " + peri);
        System.out.println("Area: " + area);
    }
}
