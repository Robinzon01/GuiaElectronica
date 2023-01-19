
package guiaelectronico.controller;

import guiaelectronico.factory.ConexionOracle;
import guiaelectronico.model.Arccdp;
import guiaelectronico.model.Arfacc;
import guiaelectronico.model.UnidadMedida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ClsDatoInicio {
    
    private ConexionOracle coxOracle = new ConexionOracle();
    
    private void getSerieCorrelativoGuia() {
    
    }
    
    public void llenarComboBoxUnidadMedida(JComboBox<UnidadMedida> cbxUM){
      try {
          PreparedStatement ps = coxOracle.conectar().prepareStatement("SELECT COD_SUNAT1,NOM FROM INVE.ARINUM WHERE NO_CIA = '01' ORDER BY NOM DESC");
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              cbxUM.addItem(new UnidadMedida(rs.getString(1), rs.getString(2)));
          }
          rs.close();
          ps.close();
      }catch (SQLException e) {
	e.printStackTrace();
      }
    }
    
    public void llenarComboBoxUMPesoTotal(JComboBox<UnidadMedida> cbxUM){

          UnidadMedida um  = new UnidadMedida("KGM","KILOGRAMOS");
          cbxUM.addItem(um);

          UnidadMedida um2 = new UnidadMedida("TNE","TONELADAS");
          cbxUM.addItem(um2);

    }
    
    public void llenarSerieCorreGuia(JComboBox<Arfacc> cbxArfacc) {
      try {
          PreparedStatement ps = coxOracle.conectar().prepareStatement("SELECT SERIE, (CONS_DESDE + 1) CORRE FROM FACTU.ARFACC WHERE no_cia = '01' and centro = '33' and tipo_doc = 'G' and activo = 'S' and substr(serie,0,2) = '00'");
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              cbxArfacc.addItem(new Arfacc(rs.getString(1), rs.getInt(2) ));
          }
          rs.close();
          ps.close();
      }catch (SQLException e) {
	e.printStackTrace();
      }
    }
    
    public void getDatosArfamc(JLabel nombreCia, JLabel rucCia) {
      try {
          PreparedStatement ps = coxOracle.conectar().prepareStatement("SELECT NO_CLIENTE_ONLINE, NOMBRE FROM FACTU.ARFAMC WHERE NO_CIA = '01'");
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              rucCia.setText(rs.getString(1));
              nombreCia.setText(rs.getString(2));
          }
          rs.close();
          ps.close();
      }catch (SQLException e) {
	e.printStackTrace();
      }
    }
    
    public void getDireccionArfamc(JTextField txtDirec1, JTextField txtDirec2) {
      try {
          PreparedStatement ps = coxOracle.conectar().prepareStatement("SELECT Z.DIRECCION, W.DESC_DIST||' - '||V.DESC_PROV||' - '||X.DESC_DEPA||' - '||'PERÚ' DIREC2\n" +
                            "FROM FACTU.SUCURSAL_PTOVTA Z, ARCCDP X, arccpr V, ARCCDI W\n" +
                            "WHERE Z.NO_CIA = '01'\n" +
                            "AND Z.COD_SUCURSAL = '001'\n" +
                            "AND X.NO_CIA = Z.NO_CIA\n" +
                            "AND X.CODI_DEPA = Z.CODI_DEPA\n" +
                            "AND V.NO_CIA = Z.NO_CIA\n" +
                            "AND V.CODI_DEPA = X.CODI_DEPA\n" +
                            "AND V.CODI_PROV = Z.CODI_PROV\n" +
                            "AND W.NO_CIA = Z.NO_CIA\n" +
                            "AND W.CODI_DEPA = Z.CODI_DEPA\n" +
                            "AND W.CODI_PROV = Z.CODI_PROV\n" +
                            "AND W.CODI_DIST = Z.CODI_DIST");
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              txtDirec1.setText(rs.getString(1));
              txtDirec2.setText(rs.getString(2));
          }
          rs.close();
          ps.close();
      }catch (SQLException e) {
	e.printStackTrace();
      }
    }
    
    public void llenarDepartamento(JComboBox<Arccdp> cbxDestiDepa) {
      try {
          PreparedStatement ps = coxOracle.conectar().prepareStatement("SELECT CODI_DEPA, DESC_DEPA FROM CXC.ARCCDP WHERE NO_CIA = '01' ORDER BY DESC_DEPA ASC");
          ResultSet rs = ps.executeQuery();
          cbxDestiDepa.addItem(new Arccdp("", "Seleccionar Departamento"));
          while (rs.next()) {
              cbxDestiDepa.addItem(new Arccdp(rs.getString(1), rs.getString(2) ));
          }
          rs.close();
          ps.close();
      }catch (SQLException e) {
	e.printStackTrace();
      }
    }
    
}
