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
    DATOS BUS:
    Una micro tiene un conductor asignado, matricula y linea.

*/ 

public class Buses {
    // atributos de la micro
    private String Nombre_conductor;
    private String Patente;
    

    public Buses(String Nombre_conductor, String Patente) {
        this.Nombre_conductor = Nombre_conductor;
        this.Patente = Patente;
        
    }

    // Accesores
    // Accesores prueba uwu

    public String getNombre_conductor() {
        return Nombre_conductor;
    }

    public String getPatente() {
        return Patente;
    }


    // Mutadores
    public void setNombre_conductor(String Nombre_conductor) {
        this.Nombre_conductor = Nombre_conductor;
    }

    public void setPatente_letra(String Patente) {
        this.Patente = Patente;
    } 

    // comportamientos
}
