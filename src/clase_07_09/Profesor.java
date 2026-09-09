
package clase_07_09;

/**
 * El constructor por defecto inicializa  los valores como: 
 * 'Sin Registrar', 'Desconocido' y 'Pendiente'.
 */
public class Profesor {

    private String cedula;

    private String nombreCompleto;
    
    private String tituloAcademico;

    //private void tituloAcademico: String;

   
    public Profesor() {
        // TODO implement here
         this.cedula = "Sin Registrar.";
        this.nombreCompleto = "Desconocido";
        this.tituloAcademico = "Pendiente";
    }

    
    public Profesor(String cedula, String nombreCompleto) {
        // TODO implement here
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.tituloAcademico = "Pendiente";
    }

    public Profesor(String cedula, String nombreCompleto, String tituloAcademico) {
        // TODO implement here
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.tituloAcademico = tituloAcademico;
    }

   
    public String getCedula() {
        // TODO implement here
        return cedula;
    }

    /**
     * @param cedula
     */
    public void setCedula(String cedula) {
        // TODO implement here
        this.cedula = cedula;
        //el que está en el this es el atributo, el otro es del parámetro
    }

    
    public String getNombreCompleto() {
        // TODO implement here
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        // TODO implement here
        this.nombreCompleto = nombreCompleto;
    }

    public String getTituloAcademico() {
        // TODO implement here
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        // TODO implement here
        
        this.tituloAcademico = tituloAcademico; 
    }

    /**
     * 
     */
    public void mostrarDatos() {
        // TODO implement here
        
        System.out.println("-----DATOS-----");
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Título: " + getTituloAcademico());
        
    }

}