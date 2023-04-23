package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;


/*
    DATOS BUS:
    Una micro tiene un conductor asignado, matricula y linea.

*/ 

public class Buses {
    // atributos de la micro
    private String nombreConductor;
    private String patente;
    

    public Buses(String nombreConductor, String patente) {
        this.nombreConductor = nombreConductor;
        this.patente = patente;
        
    }

    // Accesores
    // Accesores prueba uwu

    public String getnombreConductor() {
        return nombreConductor;
    }

    public String getpatente() {
        return patente;
    }


    // Mutadores
    public void setnombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setpatente_letra(String patente) {
        this.patente = patente;
    } 

    // comportamientos

    public void conducir() {
        System.out.println("La micro " + patente + " conducida por " + nombreConductor + " está en movimiento.");
    }
    
}
