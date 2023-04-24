/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Conductor {
    
    private String nombre;
    private String apellido;
    private String rut;

    public static ArrayList<Conductor> listaConductores = new ArrayList<Conductor>();

    //-------- CONSTRUCTOR --------

    public Conductor(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }
    
    //--------- GET        --------

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    //--------- SET        --------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
//--------- comportamientos ---
    
//--------- FUNCIONES ---------
//2.- AGREGAR DATO
//3.- IMPRIMIR DATOS
//4.- MODIFICAR/ACTUALIZAR DATO
//5.- ELIMINAR