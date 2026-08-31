/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase03_08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio20 {
    public static void main(String[]args){
        Scanner ingreso = new Scanner(System.in);
        double n1, n2, n3, n4, n5;
        double prom;
        System.out.println("Favor ingrese el primer numero: ");
        n1 = ingreso.nextDouble();
        System.out.println("Favor ingrese el segundo numero: ");
        n2 = ingreso.nextDouble();
        System.out.println("Favor ingrese el tercer numero: ");
        n3 = ingreso.nextDouble();
        System.out.println("Favor ingrese el cuarto numero: ");
        n4 = ingreso.nextDouble();
        System.out.println("Favor ingrese el quinto numero: ");
        n5 = ingreso.nextDouble();
        
        prom = (n1 + n2 + n3 + n4 + n5) / 5;
        System.out.println("El promedio es: " + prom);
    }
}
