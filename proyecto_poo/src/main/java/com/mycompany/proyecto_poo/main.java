/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_poo;

// libreria scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author jose
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Bienvenido a nuestro programa.");
        System.out.println("Seleccione que operación desea realizar:");
        int opcion;
        
        Scanner Entrada=new Scanner(System.in);
        
        do{
            System.out.println("1- Leer Datos");
            System.out.println("0- Salir del programa");
            // scanf
            opcion=Entrada.nextInt();
            
            switch(opcion){
                case 1: 
                        InsertarDatosTxt();
                        System.out.println("Operacion realizada con exito.");
                    break;      
                    
                default: 
                       System.out.println("La opción que ingreso no es valida");
                    break;
            }
            
        }while(opcion != 0);
    }

    public static void InsertarDatosTxt() throws FileNotFoundException{
        
        // lee el archivo txt
        String Buses="src/test/java/buses.txt";
        String Recorrido="src/test/java/recorrido.txt";
        int i=0;
        
        try{
            
            File archivoBuses=new File(Buses);
            System.out.println(archivoBuses.getAbsolutePath());
            Scanner scannerBuses = new Scanner(archivoBuses);
            
            while (scannerBuses.hasNext()) {
                String []datos=scannerBuses.next().split(";");
                System.out.print("Linea "+i + " Nombre del conductor: "+datos[0]);
                System.out.print("Patente_letra "+datos[1]);
                System.out.println("Patente_numero "+datos[2]);
            }
            scannerBuses.close();
            
            
            File archivoRecorrido=new File(Recorrido);
            System.out.println(archivoRecorrido.getAbsolutePath());
            Scanner scannerRecorrido = new Scanner(archivoRecorrido);
            
            i=0;
            
            while (scannerRecorrido.hasNext()) {
                String []datos=scannerBuses.next().split(";");
                System.out.print("Linea "+i + " Numero de recorrido"+datos[0]);
                System.out.print("Conductor asociado 1"+datos[1]);
                System.out.println("Conductor asociado 2"+datos[2]);
                i++;
            }
            scannerRecorrido.close();
            
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
             
    }

}


