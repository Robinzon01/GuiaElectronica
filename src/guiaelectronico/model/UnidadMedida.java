
package guiaelectronico.model;

public class UnidadMedida {
    
    private String codSunat;
    private String nombre;

    public UnidadMedida() {
    }

    public UnidadMedida(String codSunat, String nombre) {
        this.codSunat = codSunat;
        this.nombre = nombre;
    }

    public String getCodSunat() {
        return codSunat;
    }

    public void setCodSunat(String codSunat) {
        this.codSunat = codSunat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
      return this.codSunat+" - "+this.nombre;
    }
}
