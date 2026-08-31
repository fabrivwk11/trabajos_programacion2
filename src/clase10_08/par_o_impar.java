/*
Ejercicio 2 (Par o Impar): Solicita un número entero y, utilizando el operador módulo (%), determina
si el número es par o impar.
 */
package clase10_08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class par_o_impar {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out,true,StandardCharsets.UTF_8));
        Scanner ingreso = new Scanner(System.in);
        int n;
        
        System.out.println("Favor ingrese un número entero: ");
        n = ingreso.nextInt();
        
        if(n%2==0){
            System.out.println("El número es PAR.");
        }else{
            System.out.println("El número es IMPAR.");
        }
    }
}
