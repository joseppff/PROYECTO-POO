/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */

/*
    DATOS DE RECORRIDOS:
    Un recorrido es la linea de la micro, esta puede tener 2 o más micreros. 
    Ejem: 108 tiene a Juan y Antonio.

*/ 

public class Recorrido {
    //atributos de la micro
    //atributos de la micro
    private int numeroRecorrido;
    private int cantParadas;
    private String nombreParadas;
    private ArrayList<String> listaParadas;

    public static ArrayList<Recorrido> nuevaListaParadas = new ArrayList<Recorrido>();
    
//-------- CONSTRUCTOR --------

    public Recorrido(int numeroRecorrido, int cantParadas, String nombreParadas, ArrayList<String> listaParadas) {
        this.numeroRecorrido = numeroRecorrido;
        this.cantParadas = cantParadas;
        this.nombreParadas = nombreParadas;
        this.listaParadas = listaParadas;
    }

//--------- GET        --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public int getCantParadas() {
        return cantParadas;
    }

    public String getNombreParadas() {
        return nombreParadas;
    }

    public ArrayList<String> getListaParadas() {
        return listaParadas;
    }
    
    //Mutadores
    //Mutadores

    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setCantParadas(int cantParadas) {
        this.cantParadas = cantParadas;
    }

    public void setNombreParadas(String nombreParadas) {
        this.nombreParadas = nombreParadas;
    }   
    
//--------- FUNCIONES
/*
            System.out.println("2.- Agregar Datos.");
            System.out.println("3.- Imprimir Datos.");
            System.out.println("4.- Actualizar/Modificar Datos");
            System.out.println("5.- Eliminar");
            System.out.println("6.- Leer datos de un archivo excel.");
    */    

}

//5.- Eliminar
    public static void eliminarRecorrido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de recorrido que desea eliminar: ");
        String patente = scanner.nextLine();
        boolean encontrado = false;
        
        for (Recorrido recorrido : listaParadas) {
            if (recorrido.getPatenteBus().equals(patente)) {
                listaParadas.remove(recorrido);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El recorrido con patente " + patente + " ha sido eliminado.");
        } else {
            System.out.println("No se encontró ningún recorrido con patente " + patente + ".");
        }
    }
}

//5.- Eliminar
    public static void eliminarRecorrido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de recorrido que desea eliminar: ");
        String patente = scanner.nextLine();
        boolean encontrado = false;
        
        for (Recorrido recorrido : listaParadas) {
            if (recorrido.getPatenteBus().equals(patente)) {
                listaParadas.remove(recorrido);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El recorrido con patente " + patente + " ha sido eliminado.");
        } else {
            System.out.println("No se encontró ningún recorrido con patente " + patente + ".");
        }
    }
}
