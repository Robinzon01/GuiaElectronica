
package guiaelectronico.model;

public class Arcctda {
    
    private String noCliente;
    private String nombre;
    private String direccion;
    private String codiDepa;
    private String codiProv;
    private String codiDist;

    public Arcctda() {
    }

    public Arcctda(String noCliente, String nombre, String direccion, String codiDepa, String codiProv, String codiDist) {
        this.noCliente = noCliente;
        this.nombre    = nombre;
        this.direccion = direccion;
        this.codiDepa = codiDepa;
        this.codiProv = codiProv;
        this.codiDist = codiDist;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodiDepa() {
        return codiDepa;
    }

    public void setCodiDepa(String codiDepa) {
        this.codiDepa = codiDepa;
    }

    public String getCodiProv() {
        return codiProv;
    }

    public void setCodiProv(String codiProv) {
        this.codiProv = codiProv;
    }

    public String getCodiDist() {
        return codiDist;
    }

    public void setCodiDist(String codiDist) {
        this.codiDist = codiDist;
    }
    
    
    
}
