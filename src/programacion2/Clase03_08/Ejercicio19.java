/*
Imprimir la tercera potencia de un número que se ingresa por teclado.
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio19 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double n, pot;
        System.out.println("Favor ingrese un numero: ");
        n = ingreso.nextDouble();
        pot = pow(n,3);
        System.out.println("La raiz es : " + pot);
    }
}
