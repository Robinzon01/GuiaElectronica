
package guiaelectronico.model;

public class Oracle {
    
   private String usuario;
   private String password;
   private String host;
   private int puerto;
   private String sid;

    public Oracle() {
    }

    public Oracle(String usuario, String password, String host, int puerto, String sid) {
        this.usuario = usuario;
        this.password = password;
        this.host = host;
        this.puerto = puerto;
        this.sid = sid;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
   
    // METODO QUE NOS DEVUEL UNA CADENA DE TEXTO CON EL FORMATO NECESARIO PARA GUARDAR EN EL ARCHIVO PLANO DE ORACLE
    public String tsname(){
      String cadena = this.getUsuario().trim()+","+this.getPassword().trim()+","+
              this.getHost().trim()+","+String.valueOf(this.getPuerto()).trim()+","+this.getSid().trim();
      return cadena;
    }
    
}
