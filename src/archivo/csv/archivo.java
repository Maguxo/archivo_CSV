package archivo.csv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;


public class archivo {



    public static List agregar(){
        String sigue, matricula,marca, modelo;
        double deposito;
      List<usuario> lis= new ArrayList<>();
       Scanner es= new Scanner(System.in);
      do{
          System.out.print("Desea Agregar datos? (si/no): "); sigue= es.next();
            if(!sigue.equalsIgnoreCase("no")){
               System.out.print("Ingrese Matricula: "); matricula= es.next();
               System.out.print("Ingrese Marca: ");marca= es.next();
               System.out.print("Ingrese Deposito: $");  deposito= es.nextDouble();
               System.out.print("Ingrese Modelo: ");    modelo= es.next();
              
               usuario us= new usuario(matricula,marca,deposito,modelo);
               lis.add(us);
            
            }
          
      }while(!sigue.equalsIgnoreCase("no"));
    
    
    return lis;
    }
    
    public String[] cabezaCSV(){
      
       
        String[] cabeza= new String[]{
               "Matricula;",
                "Marca;",
                "T_Deposito;",
                "Modelo;\n",
        };
         
       
        
        return cabeza;
    }
}
    

