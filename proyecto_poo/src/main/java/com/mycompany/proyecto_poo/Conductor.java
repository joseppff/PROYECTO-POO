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
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getRUT() {
        return RUT;
    }

    //--------- SET        --------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRUT(int RUT) {
        this.RUT = RUT;
    }

    //imprimir

    public void imprimirDatos() {
        System.out.println("ID del conductor: " + this.idConductor);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Apellido: " + this.Apellido);
        System.out.println("RUT: " + this.RUT);
    }
    
//--------- comportamientos ---
    
//--------- FUNCIONES ---------
//2.- AGREGAR DATO
//3.- IMPRIMIR DATOS
//4.- MODIFICAR/ACTUALIZAR DATO
//5.- ELIMINAR