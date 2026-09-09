
package clase_17_08;

public class Cilindro {
    private double alturaMetros;
    private double diametroMetros;

    public Cilindro() {
        this.alturaMetros = 1.0;
        this.diametroMetros = 1.0;
    }

    /**
     * @param altura 
     * @param diametro
     */
    public Cilindro(double altura, double diametro) {
        setAlturaMetros(altura);
        setDiametroMetros(diametro);
    }


    public double getAlturaMetros() {

        return alturaMetros;
    }

    /**
     * @param alturaMetros
     */
    public void setAlturaMetros(double alturaMetros) {
        if(alturaMetros > 0){
            this.alturaMetros = alturaMetros;
        }else{
            System.out.println("La altura debe ser mayor a 0.");
        }
    }

    /**
     * @return
     */
    public double getDiametroMetros() {
        return diametroMetros;
    }

    /**
     * @param diametroMetros
     */
    public void setDiametroMetros(double diametroMetros) {
        if(diametroMetros > 0){
            this.diametroMetros = diametroMetros;
        }else{
            System.out.println("El diametro debe ser mayor a 0.");
        }
    }

    /**
     * @return
     */
    public double calcularRadio() {
        // TODO implement here
        return this.diametroMetros/2.0;
    }

    /**
     * @return
     */
    public double calcularVolumen() {
        double radio = calcularRadio();
        return Math.PI * Math.pow(radio, 2) * this.alturaMetros;
    }

}