
package _07092026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class test_profesor {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        /*
        Profesor profe = new Profesor();
        profe.mostrarDatos();
        
        Profesor profe1 = new Profesor("5.677.066", "Yo.");
        profe1.mostrarDatos();
        
        Profesor profe2 = new Profesor("6.554.001", "Carlos Gomez.", "Conserje.");
        profe2.mostrarDatos();
        */
        Profesor docente = new Profesor();
        
        /*docente.setCedula("2.550.120.");
        docente.setNombreCompleto("Ambrosio Cubilla.");
        docente.setTituloAcademico("Ingeniero Social.");
        */
        //docente.mostrarDatos();
        
        //System.out.println("Cédula: " + docente.getCedula());
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su número de cédula: ");
        String cedula = scanner.nextLine();
        docente.setCedula(cedula);
        
         
        System.out.println("Ingrese su nombre del docente: ");
        String nombre = scanner.nextLine();
        docente.setNombreCompleto(nombre);
        
        System.out.println("Ingrese el título del docente: ");
        String titulo = scanner.nextLine();
        docente.setTituloAcademico(titulo);
        
        docente.mostrarDatos();
    }
}
