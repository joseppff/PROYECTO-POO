package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;


/*
    DATOS BUS:
    Una micro tiene un conductor asignado, matricula y linea.

*/ 

public class Buses {
    // atributos de la micro
    private String Nombre_conductor;
    private String PatenteMicro;
    

    public Buses(String Nombre_conductor, String PatenteMicro) {
        this.Nombre_conductor = Nombre_conductor;
        this.PatenteMicro = PatenteMicro;
        
    }

    // Accesores
    // Accesores prueba uwu

    public String getNombre_conductor() {
        return Nombre_conductor;
    }

    public String getPatente() {
        return PatenteMicro;
    }


    // Mutadores
    public void setNombre_conductor(String Nombre_conductor) {
        this.Nombre_conductor = Nombre_conductor;
    }

    public void setPatente_letra(String PatenteMicro) {
        this.PatenteMicro = PatenteMicro;
    } 

    // comportamientos

    public void conducir() {
        System.out.println("La micro " + PatenteMicro + " conducida por " + Nombre_conductor + " está en movimiento.");
    }


    //imprimir

    public void imprimirDatos() {
        System.out.println("Número de recorrido: " + this.numeroRecorrido);
        System.out.println("ID del conductor: " + this.idConductor);
        System.out.println("Patente de la micro: " + this.PatenteMicro);
    }
    
            

        
    

    
}
