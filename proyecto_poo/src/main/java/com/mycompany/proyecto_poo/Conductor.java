/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

/**
 *
 * @author diego
 */
public class Conductor {
    
    private int id;
    private String nombre;
    private String apellido;
    private String rut;

//-------- CONSTRUCTOR --------

    public Conductor(int id, String nombre, String apellido, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }
//--------- GET        --------
    public int getId() {
        return id;
    }

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
    public void setId(int id) {
        this.id = id;
    }

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
    
    

}
