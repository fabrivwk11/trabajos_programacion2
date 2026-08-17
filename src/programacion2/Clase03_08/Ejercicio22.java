/*
22. Las estadísticas mencionan que un ser humano consume anualmente (4 arañas, 8 mosquitos
y 6 zancudos). Dado que el peso promedio de las arañas es de 0.1 gramos, 0.05 para los
mosquitos y 0.095 para los zancudos. Dada la edad de la persona, calcular los kilogramos
de bichos que ha consumido, mostrando el valor por cada categoría y el total.
 */
package programacion2.Clase03_08;

import java.util.Scanner;
        
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int edad;
        double arañas;
        double mosquitos;
        double zancudos;
        double totalInsectos;
        
        System.out.println("Favor ingrese su edad: ");
        edad = ingreso.nextInt();
        
        arañas = (4 * 0.1 * edad) / 1000;
        mosquitos = (8 * 0.05 * edad) / 1000;
        zancudos = (6 * 0.095 * edad) / 1000;
        
        totalInsectos = (arañas + mosquitos + zancudos);
        
        System.out.println("A consumido " + arañas + " Kg de arañas.");
        System.out.println("A consumido " + mosquitos + " Kg de mosquitos.");
        System.out.println("A consumido " + zancudos + " Kg de zancudos.");
        System.out.println("En total a consumido un total de " + totalInsectos + " Kg de insectos.");
        
    }
}
