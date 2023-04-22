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
public class Buses {
    //atributos de la micro
    private String Nombre_conductor;
    private String Patente_letra;
    private int Patente_numero;

    public Buses(String Nombre_conductor, String Patente_letra, int Patente_numero) {
        this.Nombre_conductor = Nombre_conductor;
        this.Patente_letra = Patente_letra;
        this.Patente_numero = Patente_numero;
    }

    //Accesores
    //Accesores prueba 


    public String getNombre_conductor() {
        return Nombre_conductor;
    }

    public String getPatente_letra() {
        return Patente_letra;
    }

    public int getPatente_numero() {
        return Patente_numero;
    }

    //Mutadores
    public void setNombre_conductor(String Nombre_conductor) {
        this.Nombre_conductor = Nombre_conductor;
    }

    public void setPatente_letra(String Patente_letra) {
        this.Patente_letra = Patente_letra;
    }

    public void setPatente_numero(int Patente_numero) {
        this.Patente_numero = Patente_numero;
    }
    
    //comportamientos
}
