
package archivo.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



public class ArchivoCSV {


    public static void main(String[] args) throws IOException {

      System.out.println("\t\t ARCHIVO CSV");
      System.out.println("Si no desea continuar escriba Ok");

     
      archivo ar= new archivo();
      List<usuario> lista= archivo.agregar();
      
       File f= new File("./archivo_CSV.csv");
      
       
     
       try(FileWriter fw= new FileWriter(f)){
       
          
            for(int i=0; i<ar.cabezaCSV().length;i++){
                String w= ar.cabezaCSV()[i];
                fw.write(w);
            }
           for(usuario u: lista){
               
               fw.write(u.tousuario()+"\n");
           
           }
       }catch(Exception ex){
       ex.printStackTrace();
           System.out.println("No se pudo");
       }
       
     
    }
    
}
