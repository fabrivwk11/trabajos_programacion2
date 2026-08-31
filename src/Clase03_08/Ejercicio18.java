/*
Imprimir la raíz cuadrada de un número que se ingresa por teclado.
 */
package Clase03_08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio18 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double n, raiz;
        System.out.println("Favor ingrese un numero: ");
        n = ingreso.nextDouble();
        raiz = sqrt(n);
        System.out.println("La raiz es : " + raiz);
    }
}
