/*
El área de un cuadrado es 5,76 cm2
.Calcular el perímetro del cuadrado.
 */
package Clase03_08;

import static java.lang.Math.sqrt;

/**
 *
 * @author Admin
 */
public class Ejercicio4 {
    public static void main(String[]args){
        double area = 5.76;
        double lado = sqrt(5.76);
        double peri = lado*4;
        System.out.println("El perimetro del cuadrado es: " + peri);
    }
}
