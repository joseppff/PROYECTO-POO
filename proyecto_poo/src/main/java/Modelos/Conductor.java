/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author diego
 */
public class Conductor{
    
    private String nombre;
    private String apellido;
    private String rut;
    private String patenteAsociada;

    //-------- CONSTRUCTOR --------

    public Conductor(String nombre, String apellido, String rut, String patenteAsociada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.patenteAsociada = patenteAsociada;
    }

    
    
    
    public Conductor(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPatenteAsociada() {
        return patenteAsociada;
    }

    public void setPatenteAsociada(String patenteAsociada) {
        this.patenteAsociada = patenteAsociada;
    }

    
}
