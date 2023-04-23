package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;


/*
    DATOS BUS:
    Una micro tiene un conductor asignado, matricula y linea.

*/ 

public class Buses {
    // atributos de la micro
    private int idBus;
    private String patente;
    

    public Buses(int idBus, String patente) {
        this.idBus = idBus;
        this.patente = patente;
        
    }

    // Accesores
    // Accesores prueba uwu

    public int getidBus() {
        return idBus;
    }

    public String getpatente() {
        return patente;
    }


    // Mutadores
    public void setidBus(int idBus) {
        this.idBus = idBus;
    }

    public void setpatente_letra(String patente) {
        this.patente = patente;
    } 

    // comportamientos

    public void conducir() {
        System.out.println("La micro " + patente + " de id " + idBus + " está en movimiento.");
    }
    
}
