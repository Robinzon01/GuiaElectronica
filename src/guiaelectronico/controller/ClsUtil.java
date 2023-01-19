/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaelectronico.controller;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ClsUtil {
    
    public void sololetras(KeyEvent e){
                char ca=e.getKeyChar();
                int k = (int) e.getKeyChar();
                if (k > 47 && k < 58) {
                e.setKeyChar((char) KeyEvent.VK_CLEAR);
                e.consume();
                  }
    }

    public void solonumero(KeyEvent evt) {
            int k = (int) evt.getKeyChar();
            if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                evt.consume();
                JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
            }
            if (k == 241 || k == 209) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                evt.consume();
                JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
            }

    }

    public String maxLetras(String cont,int num){
        if(cont.length()>num){
            cont=cont.substring(0, (num-1));
        }
         return cont;//JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
    }

    public void NoExcribe(KeyEvent E){
       E.consume();
    }

    public void Mayusculas(JTextField tx){
       tx.setText(tx.getText().toUpperCase());
    }

    public void MarcaTxt(JTextField txt){
        txt.setSelectionStart(0);txt.setSelectionEnd(txt.getText().length());txt.requestFocus();
    }

    public void MarcaTxt(JPasswordField ps){
        ps.setSelectionStart(0);
        ps.setSelectionEnd(ps.getText().length());   
    }

    public void Enter(KeyEvent e, JButton btn){
            if(e.getKeyChar()==10){
                btn.doClick();
            }
    }

    public void Minusculas(JTextField txt){
        txt.setText(txt.getText().toLowerCase());
    }

    public void SinEspcBlanco(KeyEvent e,JTextField t){
            if(e.getKeyChar()==32){
                if(t.getCaretPosition()==0){
                    e.consume();
                }
                else{
                    if(t.getCaretPosition()<t.getText().length()){
                        if((t.getText().charAt(t.getCaretPosition()-1)==' ')||(t.getText().charAt(t.getCaretPosition())==' '))
                            e.consume();
                            JOptionPane.showMessageDialog(null, "Sin espacio en blanco!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        if(t.getText().charAt(t.getCaretPosition()-1)==' ')
                            e.consume();
                            JOptionPane.showMessageDialog(null, "Sin espacio en blanco!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
    }

    // CAPTURAR FECHA ACTUAL
    public String fechaString(Calendar fecha) {
        String retorno = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(fecha != null) {
           retorno = sdf.format(fecha.getTime());
        }
        return retorno;
    }

    public Calendar fechaCalendar(String fecha) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Calendar calendar = Calendar.getInstance();
      try{
        calendar.setTime(sdf.parse(fecha));
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error de formato de fecha: " + e);
      }
      return calendar;
    }

    public void obtenerFechaSistema(JFormattedTextField jftxt) {
        Calendar cal = Calendar.getInstance();
        String fechaString = this.fechaString(cal);
        jftxt.setText(fechaString);
    }
    
    public String formatoFechaYYYYMMDD(String fechaEmision) {
        SimpleDateFormat formatoDeEntrada  = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoDeSalida   = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null;
        try {
            date = formatoDeEntrada.parse(fechaEmision);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatoDeSalida.format(date);        
    }
    
    public String capturarHora() {
       Calendar calendario = Calendar.getInstance();
       int hora, minutos, segundos;
       hora =calendario.get(Calendar.HOUR_OF_DAY);
       minutos = calendario.get(Calendar.MINUTE);
       segundos = calendario.get(Calendar.SECOND);
       return hora+":"+minutos+":"+segundos;
    }
    
    public String formatoCorrelativo(int cantidad, int correlativo) {
      String formatted = String.format("%0" + cantidad + "d", correlativo);
      return formatted;
    }
    
}
