
package clase10_08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
Ejercicio 1 (Validación de Voto): Pide al usuario su año de nacimiento. Calcula su edad actual
usando una constante para el año en curso (2026). Utiliza un if-else para imprimir si es mayor de
edad y está habilitado para votar en Paraguay (18 años o más).
 */


public class validacion_de_voto {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out,true,StandardCharsets.UTF_8));
        Scanner ingreso = new Scanner(System.in);
        int edad;
        int actual = 2026;
        int nacimiento;
        
        System.out.println("Favor ingrese el año en el que nacio: ");
        nacimiento = ingreso.nextInt();
        
        edad = actual - nacimiento;
        
        System.out.println("Usted tiene " + edad + " años");
        
        if(edad <18){
            System.out.println("Es menor de edad.");
        }else{
            System.out.println("Es mayor de edad.");
        }
    }
}
