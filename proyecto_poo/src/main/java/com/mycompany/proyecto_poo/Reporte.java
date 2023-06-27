/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

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
                
                if(i>0)LBuses.add(new Bus(Integer.parseInt(nextRecord[0]),nextRecord[1],nextRecord[2]));
                  
                
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