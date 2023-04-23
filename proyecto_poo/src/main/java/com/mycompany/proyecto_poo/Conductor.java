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
    
    private String Nombre;
    private String Apellido;
    private int RUT;

    public Conductor(String Nombre, String Apellido, int RUT) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.RUT = RUT;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getRUT() {
        return RUT;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setRUT(int RUT) {
        this.RUT = RUT;
    }
    
    
}
