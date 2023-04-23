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

public class Recorrido {
    
    private int numeroRecorrido;
    private int cantParaderos;
    private String nombreParadas;

    public ArrayList<Recorrido> paradas=new ArrayList<>(cantParaderos);
    
//-------- CONSTRUCTOR --------
    public Recorrido(int numeroRecorrido, int cantParaderos, String nombreParadas) {
        this.numeroRecorrido = numeroRecorrido;
        this.cantParaderos = cantParaderos;
        this.nombreParadas = nombreParadas;
    }
    
//--------- GET        --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public int getCantParaderos() {
        return cantParaderos;
    }

    public String getnombreParadas() {
        return nombreParadas;
    }
    
    
//--------- SET        --------

    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setCantParaderos(int cantParaderos) {
        this.cantParaderos = cantParaderos;
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
