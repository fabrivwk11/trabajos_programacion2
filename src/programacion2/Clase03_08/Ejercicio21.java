/*
Para crear una hoja, es necesario el uso de 2560 gramos de madera y un árbol papelero
pesa en promedio tres cuartos de tonelada. Calcular ¿cuántos árboles se necesitan para
crear n resmas de papel? Si una resma son 500 hojas.
 */
package programacion2.Clase03_08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int resma;
        int gramosPorHoja = 2560;
        int kilosPorArbol = 750;
        int gramosPorArbol = kilosPorArbol*1000;
        int madera;
        int cantidad;
        System.out.println("Ingrese la cantidad de resmas: ");
        resma = ingreso.nextInt();
        
        madera = resma * 500 * gramosPorHoja;
        cantidad = (int) Math.ceil((double)madera / gramosPorArbol);
        
        System.out.println("Se necesitan en total: " + cantidad + " para " + resma + " Resmas");
    }
    
}
