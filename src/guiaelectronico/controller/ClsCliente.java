
package guiaelectronico.controller;

import guiaelectronico.factory.ConexionOracle;
import guiaelectronico.model.Arccdp;
import guiaelectronico.model.Arcctda;
//import guiaelectronico.model.UnidadMedida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ClsCliente {
    private ConexionOracle coxOracle = new ConexionOracle();
    Arcctda objArcctda = null;
    
    public void cargardatos(String campo,JTextField jt,JTextField txtRazonSocial, JList Thelist,
               JScrollPane SUBIRYBAJAR, DefaultListModel modelolista, JPopupMenu jPopupMenu1) {
        
        SUBIRYBAJAR.setViewportView(Thelist);
        jPopupMenu1.add(SUBIRYBAJAR); 
         try{
            String csta     = "SELECT RUC, NOMBRE FROM CXC.ARCCMC WHERE NO_CIA = '01' AND ACTIVO = 'S'";
            String consulta = csta+" AND "+campo+" LIKE '"+jt.getText().trim()+"%'";   
            // System.err.println(consulta);
            Thelist.removeAll();
            modelolista.removeAllElements();
            int contadorlista = 0;
            
            PreparedStatement ps = coxOracle.conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();                    
            while(rs.next()){
               String marr=rs.getString(1)+"-"+rs.getString(2); 
               modelolista.addElement(marr);
            }
            rs.close();
            ps.close();
            Thelist.setModel(modelolista);

            jPopupMenu1.setLocation(jt.getLocationOnScreen().x+0,jt.getLocationOnScreen().y+25);
            if(jt.getText().trim().length()==0 || Thelist.getModel().getSize()==0){
                jPopupMenu1.setVisible(false);
            }else{
                jPopupMenu1.setVisible(true);                
            }
            Thelist.setSelectedIndex(contadorlista);
            //this.capturarDatosCliente(jt, txtRazonSocial, Thelist, jPopupMenu1);
            
          }
          catch(Exception E){
              JOptionPane.showMessageDialog(null, E.getMessage());   
          }

    }
    
    public void cargardatosNombre(String campo,JTextField jt,JTextField txtRazonSocial, JList Thelist,
               JScrollPane SUBIRYBAJAR, DefaultListModel modelolista, JPopupMenu jPopupMenu1) {
        
        SUBIRYBAJAR.setViewportView(Thelist);
        jPopupMenu1.add(SUBIRYBAJAR); 
         try{
            String csta     = "SELECT RUC, NOMBRE FROM CXC.ARCCMC WHERE NO_CIA = '01' AND ACTIVO = 'S'";
            String consulta = csta+" AND "+campo+" LIKE '%"+txtRazonSocial.getText().trim().toUpperCase()+"%'";   
            // System.err.println(consulta);
            Thelist.removeAll();
            modelolista.removeAllElements();
            int contadorlista = 0;
            
            PreparedStatement ps = coxOracle.conectar().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();                    
            while(rs.next()){
               String marr=rs.getString(1)+"-"+rs.getString(2); 
               modelolista.addElement(marr);
            }
            rs.close();
            ps.close();
            Thelist.setModel(modelolista);

            jPopupMenu1.setLocation(txtRazonSocial.getLocationOnScreen().x+0,txtRazonSocial.getLocationOnScreen().y+25);
            if(txtRazonSocial.getText().trim().length()==0 || Thelist.getModel().getSize()==0){
                jPopupMenu1.setVisible(false);
            }else{
                jPopupMenu1.setVisible(true);                
            }
            Thelist.setSelectedIndex(contadorlista);
            //this.capturarDatosCliente(jt, txtRazonSocial, Thelist, jPopupMenu1);
            
          }
          catch(Exception E){
              JOptionPane.showMessageDialog(null, E.getMessage());   
          }

    }
    
    private void capturarDatosCliente(JTextField txtRuc,JTextField txtRazonSocial, JList Thelist, JPopupMenu jPopupMenu1) {
        //if(Thelist.getSelectedIndex() > 0) {
           //EVENTO
            Thelist.addListSelectionListener(new ListSelectionListener() {
                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                            if(Thelist.getSelectedIndex() > 0) { 
                                String valor = Thelist.getSelectedValue().toString();
                                String[] datos = valor.split("-");
                                txtRuc.setText(datos[0]);
                                txtRazonSocial.setText(datos[1]);
                                jPopupMenu1.setVisible(false);
                            }
                            
                        }                
            } );
        //}        
    }
    
    public void getDireccionCliente(String rucCliente, JTextField txtDirecDesti, JTextField txtDirecDesti2) {
      try {
          PreparedStatement ps = coxOracle.conectar().prepareStatement("SELECT W.DIRECCION, Z.DESC_DEPA||' - '||F.DESC_PROV||' - '||X.DESC_DIST DIREC2\n" +
                "FROM CXC.ARCCTDA W, CXC.ARCCDP Z, CXC.arccpr F, CXC.ARCCDI X\n" +
                "WHERE W.NO_CIA = '01' \n" +
                "AND W.ACTIVO = 'S'\n" +
                "AND Z.NO_CIA = W.NO_CIA\n" +
                "AND Z.CODI_DEPA = W.CODI_DEPA\n" +
                "AND F.NO_CIA = W.NO_CIA\n" +
                "AND F.CODI_DEPA = W.CODI_DEPA\n" +
                "AND F.CODI_PROV = W.CODI_PROV\n" +
                "AND X.NO_CIA = W.NO_CIA\n" +
                "AND X.CODI_DEPA = W.CODI_DEPA\n" +
                "AND X.CODI_PROV = W.CODI_PROV\n" +
                "AND X.CODI_DIST = W.CODI_DIST\n" +
                "AND W.NO_CLIENTE = '"+rucCliente+"'");
          ResultSet rs = ps.executeQuery();
         
          while (rs.next()) {              
              
              txtDirecDesti.setText( rs.getString(1) );
              txtDirecDesti2.setText( rs.getString(2) );
          }

          rs.close();
          ps.close();
      }catch (SQLException e) {
	e.printStackTrace();
      }
    }
}
