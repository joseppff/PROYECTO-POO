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
    private int numeroRecorrido;
    private int cantParaderos;
    private String nombreParadas;

    public ArrayList<Recorrido> paradas=new ArrayList<>(cantParaderos);
    
    //Constructor
    public Recorrido(int numeroRecorrido, int cantParaderos, String nombreParadas) {
        this.numeroRecorrido = numeroRecorrido;
        this.cantParaderos = cantParaderos;
        this.nombreParadas = nombreParadas;
    }
    
    //Accesores

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public int getCantParaderos() {
        return cantParaderos;
    }

    public String getnombreParadas() {
        return nombreParadas;
    }
    
    
    //Mutadores

    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setCantParaderos(int cantParaderos) {
        this.cantParaderos = cantParaderos;
    }

    public void setNombreParadas(String nombreParadas) {
        this.nombreParadas = nombreParadas;
    }   
    
}
