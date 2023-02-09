
package guiaelectronico.factory;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import guiaelectronico.model.Oracle;

public class FileFactory {
    private String ruta = "D:\\oracleBD.txt";
    private String contenido = "LLE,YVL,LOCALHOST,1521,bdCelia";
    
    public Oracle crear(Oracle oracle){
        Oracle objO = null;
        try{
           /*String absoluta = new File("").getAbsolutePath();
           String ruta = absoluta+"\\src\\main\\java\\com\\robin\\finddniruc\\file\\oracle.txt";*/
           this.contenido = oracle.tsname().trim();
           File archivo = new File(this.ruta);
           //SI EL ARCHIVO NO EXISTE ES CREADO
           if(!archivo.exists()){
              archivo.createNewFile();
              FileWriter fw = new FileWriter(archivo);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(this.contenido);
              bw.close();
           }else {
              FileWriter fw = new FileWriter(archivo);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(this.contenido);
              bw.close();
           }
            //InputStream ins = new FileInputStream(archivo);
            Scanner obj = new Scanner(archivo);
            while (obj.hasNextLine()) {
                String x = obj.nextLine();
                System.out.println(" :.:.: "+x);
                String[] split = x.split(",");
                objO = new Oracle(split[0], split[1], split[2],Integer.parseInt(split[3]), split[4]);
                JOptionPane.showMessageDialog(null, "Se guardo los datos del TNSNAMES");
           }            
     
        }catch(IOException e){
            System.out.println("Error escribir archivo plano : "+e.getMessage());
            e.printStackTrace();
        }
         return objO;
    }
    
    // VAMOS A LEER EL ARCHIVO PLANO, Y MOSTRAMOS LOS DATOS EN EL JPANEL BD
    public Oracle leer(){
        Oracle objO = null;
        try{
           /*String absoluta = new File("").getAbsolutePath();
           String ruta = absoluta+"\\src\\main\\java\\com\\robin\\finddniruc\\file\\oracle.txt";*/
           File archivo = new File(this.ruta);
           //SI EL ARCHIVO NO EXISTE ES CREADO
           if(!archivo.exists()){
              archivo.createNewFile();
              FileWriter fw = new FileWriter(archivo);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(this.contenido);
              bw.close();
           }
            //InputStream ins = new FileInputStream(archivo);
            Scanner obj = new Scanner(archivo);
            while (obj.hasNextLine()) {
                String x = obj.nextLine();
                System.out.println(" .:. "+x);
                String[] split = x.split(",");
                objO = new Oracle(split[0], split[1], split[2],Integer.parseInt(split[3]), split[4]);
           }            
     
        }catch(IOException  e){
            System.out.println("Error al leer el archivo plano : "+e.getMessage());
            e.printStackTrace();
        }
         return objO;
    }
    
}
