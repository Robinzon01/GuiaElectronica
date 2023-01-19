
package guiaelectronico.factory;

import guiaelectronico.model.Oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionOracle {
    // METODO QUE NOS PERMITIRA CONECTAME CON LA BASE DE DATOS DE ORACLE
    public static Connection conectar() throws SQLException{
        FileFactory ff = new FileFactory();
        Oracle oracle  = ff.leer();
        Connection conexion = null;
        try{
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver() );
           conexion = DriverManager.getConnection ("jdbc:oracle:thin:@"+
                   oracle.getHost()+":"+oracle.getPuerto()+":"+oracle.getSid(),
                   oracle.getUsuario(), oracle.getPassword());
        }catch(SQLException ex){
            System.err.println("Error conexión : "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Fallo de Conexión : "+ex.getErrorCode(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    // METODO QUE ME PERMITE VERIFICAR SI HAY CONEXION CON LA BASE DE DATOS

    
}
