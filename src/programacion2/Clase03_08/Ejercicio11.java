/*
11. Calcular el área de un trapecio.
Area = (Base Mayor + Base Menor) * altura / 2
 */
package programacion2.Clase03_08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio11 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double h,BM,bm;
        double area;
        System.out.println("Favor ingrese la altura: ");
        h = ingreso.nextDouble();
        System.out.println("Favor ingrese la base menor");
        bm = ingreso.nextDouble();
        System.out.println("Favor ingrese la base mayor");
        BM = ingreso.nextDouble();
        
        area = (BM + bm) * h / 2;
        System.out.println("El area del trapecio es: " + area);
    }
}
