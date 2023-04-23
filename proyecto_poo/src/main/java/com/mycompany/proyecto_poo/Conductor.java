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
    private String RUT;

    private Conductor conductor;
    
    public Conductor(String Nombre, String Apellido, String RUT) {
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

    public String getRUT() {
        return RUT;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }
    
    public void agregarConductor(String Nombre, String Apellido, String RUT) {
        Conductor nuevoConductor = new Conductor(Nombre, Apellido, RUT);
        conductor = nuevoConductor;
    }
    
    public void eliminarConductor() {
        conductor = null;
    }
    
    public void modificarConductor(String nuevoNombre, String nuevoApellido, String nuevoRut) {
        conductor.setNombre(nuevoNombre);
        conductor.setApellido(nuevoApellido);
        conductor.setRUT(nuevoRut);
    }
}
