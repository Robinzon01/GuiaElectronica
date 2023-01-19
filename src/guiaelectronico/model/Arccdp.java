
package guiaelectronico.model;

import java.util.Objects;

public class Arccdp {
    
    private String codiDepa;
    private String nombreDepa;

    public Arccdp() {
    }

    public Arccdp(String codiDepa, String nombreDepa) {
        this.codiDepa = codiDepa;
        this.nombreDepa = nombreDepa;
    }

    public String getCodiDepa() {
        return codiDepa;
    }

    public void setCodiDepa(String codiDepa) {
        this.codiDepa = codiDepa;
    }

    public String getNombreDepa() {
        return nombreDepa;
    }

    public void setNombreDepa(String nombreDepa) {
        this.nombreDepa = nombreDepa;
    }
    
    public String toString() {
      return this.nombreDepa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codiDepa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Arccdp other = (Arccdp) obj;
        return Objects.equals(this.codiDepa, other.codiDepa);
    }
    
    
    
}
