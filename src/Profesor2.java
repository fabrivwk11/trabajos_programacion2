
package _07092026;

public class Profesor2 {
    private String cedula;
    private String nombreCompleto;
    private String tituloAcademico;

    public Profesor2() {
    }

    public Profesor2(String cedula, String nombreCompleto) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
    }

    public Profesor2(String cedula, String nombreCompleto, String tituloAcademico) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.tituloAcademico = tituloAcademico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public void mostrarDatos(){
        
        System.out.println("-----DATOS-----");
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Titulo: " + getTituloAcademico());
    }
    
}
