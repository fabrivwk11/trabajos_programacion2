/*
Escribir un programa que imprima la suma de 5000 y 250, la resta de 3215 y 782, la
multiplicación de 3 y 100, la división de 15000 entre 500, la raíz cuadrada de 25 y elevar
5 a la 3ra potencia.
 */
package programacion2.Clase03_08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Admin
 */
public class Ejercicio3 {
    public static void main(String[]args){
        double suma=5000+250;
        double resta=3215-782;
        double multi=100*3;
        double divi=15000/500;
        double raiz=sqrt(25);
        double pot=pow(5,3);
        
        System.out.println("La suma entre 5000+250 = " + suma);
        System.out.println("La resta entre 3215-782 = " + resta);
        System.out.println("La multiplicacion entre 100x3 = " + multi);
        System.out.println("La division entre 15000/500 = " + divi);
        System.out.println("La raiz de 25 = " + raiz);
        System.out.println("La potencia entre 5^3 = " + pot);
    }
}
