
package guiaelectronico.model;

public class Arfacc {
    private String serie;
    private int correlativo;
    
    

    public Arfacc(String serie, int correlativo) {
        this.serie = serie;
        this.correlativo = correlativo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }
    
    public String toString() {
        int width = 7;
        String formatted = String.format("%0" + width + "d", this.correlativo);
        return this.serie+"                N° "+formatted;
    }
    
}
