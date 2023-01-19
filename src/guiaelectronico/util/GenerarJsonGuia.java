/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaelectronico.util;

import guiaelectronico.model.CabeceraJsonGuia;
import guiaelectronico.model.DetalleJsonGuia;
import guiaelectronico.model.RelacionadosJsonGuia;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author CANVIA
 */
public class GenerarJsonGuia {
    
    public static String nombreArchivoJsonGuia(String ruc, String serie, int correlativo ) {
        int width = 8;
        String formatted = String.format("%0" + width + "d", correlativo);
        
        String nombreArchivoJson = ruc+"-"+"09"+"-"+serie+"-"+formatted+".json";
        return nombreArchivoJson;
    }
  
    public static JSONObject crearJsonGuia(CabeceraJsonGuia cabGuia, ArrayList<DetalleJsonGuia> detGuias, ArrayList<RelacionadosJsonGuia> relacionados) {
       JSONObject obj = new JSONObject();
       obj = crearCabeceraJsonGuia(obj, cabGuia);
       obj = crearDetalleJsonGuia(obj, detGuias);
       obj = crearRelacionadoJsonGuia(obj, relacionados);
       return obj;
    }
   
    private static JSONObject crearCabeceraJsonGuia(JSONObject obj, CabeceraJsonGuia cabGuia) { // tipoTransporte: 01 -> Publico ; 02 -> Privado
      try{
          JSONObject cab = new JSONObject();
          cab.put("fecEmision", cabGuia.getFecEmision());
          cab.put("horEmision", cabGuia.getHorEmision());
          cab.put("tipDocGuia", cabGuia.getTipDocGuia());
          cab.put("serNumDocGuia", cabGuia.getSerNumDocGuia());
          cab.put("numDocDestinatario", cabGuia.getNumDocDestinatario());
          cab.put("tipDocDestinatario", cabGuia.getTipDocDestinatario());
          cab.put("rznSocialDestinatario", cabGuia.getRznSocialDestinatario());
          cab.put("motTrasladoDatosEnvio", cabGuia.getMotTrasladoDatosEnvio());
          cab.put("desMotivoTrasladoDatosEnvio", cabGuia.getDesMotivoTrasladoDatosEnvio());
          cab.put("indTransbordoProgDatosEnvio", cabGuia.isIndTransbordoProgDatosEnvio());
          cab.put("psoBrutoTotalBienesDatosEnvio", cabGuia.getPsoBrutoTotalBienesDatosEnvio());
          cab.put("uniMedidaPesoBrutoDatosEnvio", cabGuia.getUniMedidaPesoBrutoDatosEnvio());
          cab.put("numBultosDatosEnvio",   cabGuia.getNumBultosDatosEnvio());
          cab.put("modTrasladoDatosEnvio", cabGuia.getModTrasladoDatosEnvio());
          cab.put("fecInicioTrasladoDatosEnvio", cabGuia.getFecInicioTrasladoDatosEnvio());
          switch (cabGuia.getModTrasladoDatosEnvio()) {
              case "01": // PUBLICO
                  cab.put("numDocTransportista", cabGuia.getNumDocTransportista());
                  cab.put("tipDocTransportista", cabGuia.getTipDocTransportista());
                  cab.put("nomTransportista", cabGuia.getNomTransportista());
                  break;
              case "02": // PRIVADO
                  cab.put("numPlacaTransPrivado", cabGuia.getNumPlacaTransPrivado());
                  cab.put("numDocIdeConductorTransPrivado", cabGuia.getNumDocIdeConductorTransPrivado());
                  cab.put("tipDocIdeConductorTransPrivado", cabGuia.getTipDocIdeConductorTransPrivado());
                  cab.put("nomConductorTransPrivado", cabGuia.getTipDocIdeConductorTransPrivado());                  
                  break;    
              default:
                  throw new AssertionError();
          }
          cab.put("ubiLlegada", cabGuia.getUbiLlegada());
          cab.put("dirLlegada", cabGuia.getDirLlegada());
          cab.put("ubiPartida", cabGuia.getUbiPartida());
          cab.put("dirPartida", cabGuia.getDirPartida());
          cab.put("obsGuia", cabGuia.getObsGuia());
          cab.put("ublVersionId", "2.1");
          cab.put("customizationId", "2.0");
          
          obj.put("cabecera", cab);

          return obj;
          
      }catch(Exception e){
          System.err.println(e);
          return null;
      }
    }
   
    private static JSONObject crearDetalleJsonGuia(JSONObject obj, ArrayList<DetalleJsonGuia> detGuias) {
        JSONArray listaDetalle = new JSONArray();
        for(DetalleJsonGuia detJG: detGuias) {
            JSONObject det = new JSONObject();
            det.put("uniMedidaItem", detJG.getUniMedidaItem());
            det.put("canItem", detJG.getCanItem());
            det.put("desItem", detJG.getDesItem());
            det.put("codItem", detJG.getCodItem());
            det.put("pesoItem", detJG.getPesoItem());
            det.put("bultoItem", detJG.getBultoItem());
            
            listaDetalle.add(det);
            
        }
        obj.put("detalle", listaDetalle);
        
        return obj;
    }
    
    private static JSONObject crearRelacionadoJsonGuia(JSONObject obj, ArrayList<RelacionadosJsonGuia> relacionados) {
        JSONArray listaRelacionados = new JSONArray();
        for(RelacionadosJsonGuia relaJG: relacionados) {
            JSONObject rela = new JSONObject();
            rela.put("numDocRel", relaJG.getNumDocRel());
            rela.put("codTipDocRel", relaJG.getCodTipDocRel());
            
            listaRelacionados.add(rela);
            
        }
        obj.put("relacionados", listaRelacionados);
        
        return obj;
    }
       
}
