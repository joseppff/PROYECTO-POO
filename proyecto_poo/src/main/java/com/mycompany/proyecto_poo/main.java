/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_poo;

// libreria scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.opencsv.exceptions.CsvValidationException;


/**
 *
 * @author jose
 */
public class main{

    public static void main(String[] args) throws FileNotFoundException, CsvValidationException{
        System.out.println("Bienvenido a nuestro programa.");
        System.out.println("Seleccione que operación desea realizar:");
        int opcion, subOpcion;
        
        Scanner scanner =new Scanner(System.in);
        
        do{
            System.out.println("0.- Salir del programa.");
            System.out.println("1.- Leer datos de un archivo txt.");
            System.out.println("2.- Agregar Datos.");
            System.out.println("3.- Imprimir Datos.");
            System.out.println("4.- Actualizar/Modificar Datos");
            System.out.println("5.- Eliminar");
            System.out.println("6.- Leer datos de un archivo excel.");

            // scanf
            opcion=scanner.nextInt();
            
            switch(opcion){
                case 0:
                    break;

                case 1: 
                        InsertarDatosTxt();
                        System.out.println("Operacion realizada con exito.");
                    break;
                // AGREGAR
                case 2:
                    System.out.println("Seleccione que dato desea AGREGAR:");
                    System.out.println("1.- Recorrido.");
                    System.out.println("2.- Buses.");
                    System.out.println("3.- Conductor.");
                    subOpcion=scanner.nextInt();
                    switch(subOpcion){
                        case 1:
                            Recorrido.agregar();
                        break;
                        case 2:
                            Buses.agregar();
                        break;
                        case 3:
                            Conductor.agregar();
                        break;
                        default: 
                        System.out.println("La opción que ingreso no es valida");
                        break;
                        }
                    System.out.println("Operacion realizada con exito.");
                
                //IMPRIMIR
                case 3: 
                    System.out.println("Seleccione que dato desea IMPRIMIR:");
                    System.out.println("1.- Recorrido.");
                    System.out.println("2.- Buses.");
                    System.out.println("3.- Conductor.");
                    subOpcion=scanner.nextInt();

                    switch(subOpcion){
                        case 1:
                            Recorrido.imprimirRecorrido();
                        break;
                        case 2:
                            Buses.imprimirBuses();
                        break;
                        case 3:
                            Conductor.imprimirConductor();
                        break;
                        default: 
                            System.out.println("La opción que ingreso no es valida");
                        break;
                }
                //MODIFICAR
                case 4: 
                    System.out.println("Seleccione que dato desea MODIFICAR:");
                    System.out.println("1.- Recorrido.");
                    System.out.println("2.- Buses.");
                    System.out.println("3.- Conductor.");
                    subOpcion=scanner.nextInt();
                    
                    switch(subOpcion){
                        case 1:
                            Recorrido.modificarRecorrido();
                        break;
                        case 2:
                            Buses.modificarBuses();
                        break;
                        case 3:
                            Conductor.modificarConductor();
                        break;
                        default: 
                            System.out.println("La opción que ingreso no es valida");
                        break;
                }
                //ELIMINAR
                case 5: 
                    System.out.println("Seleccione que dato desea ELIMINAR:");
                    System.out.println("1.- Recorrido.");
                    System.out.println("2.- Buses.");
                    System.out.println("3.- Conductor.");
                    subOpcion=scanner.nextInt();
                    
                    switch(subOpcion){
                        case 1:
                            Recorrido.eliminarRecorrido();
                        break;
                        case 2:
                            Buses.eliminarBuses();
                        break;
                        case 3:
                            Conductor.eliminarConductor();
                        break;
                        default: 
                            System.out.println("La opción que ingreso no es valida");
                        break;
                    }
                
                case 6:
                        leerBusesExcel();
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
    
    
    public static Reporte reporte;
    public static void leerBusesExcel() throws CsvValidationException {
        
        reporte=new Reporte("src/test/reporteBuses.csv");
        reporte.Leer();
    }
}


