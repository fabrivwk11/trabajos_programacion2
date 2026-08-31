/*
Escribir un programa que convierta guaraníes a dólares. Recibirá un número decimal
correspondiente a la cantidad en guaraníes y contestará con la cantidad correspondiente
en dólares. Suponer que el cambio es de 7500 guaraníes por 1 Dólar.
 */
package Clase03_08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner ingreso= new Scanner(System.in);
        double gs=0;
        double dl=0;
        System.out.println("Favor ingrese una cantidad en Gs.: ");
        gs = ingreso.nextDouble();
        dl= gs/6500;
        System.out.println("Dolares: " + dl);
    }
}
