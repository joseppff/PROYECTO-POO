/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reporte {
    private String Ruta;
    private ArrayList<Bus>LBuses=new ArrayList<Bus>();
    
    
    
    public Reporte(String Ruta){
        this.Ruta=Ruta;
        
    }
    
    public void Leer() throws CsvValidationException{
        File file = new File(this.Ruta);
        try {
            FileReader inputfile = new FileReader(file);
            CSVReader reader = new CSVReader(inputfile);
        
            String[] nextRecord;
            
            int i=0;
            while ((nextRecord = reader.readNext()) != null) {
                
                if (i > 0) LBuses.add(new Bus(nextRecord[0], Integer.parseInt(nextRecord[1]), Integer.parseInt(nextRecord[2]), Integer.parseInt(nextRecord[3]), nextRecord[4]));

                  //string, int, int, int, string
                
                for (String cell : nextRecord) {
                    
                    System.out.print(cell + "\t");
                }
                i++;
                System.out.println();
            }
            
        
        }catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }
}