package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */

public class Buses implements Crud{
    // atributos de la micro
    private int numeroRecorrido;
    private String rutConductorAsociado;
    private String patenteBus;
    
    public static ArrayList<Buses> listaBuses = new ArrayList<Buses>();
    
//-------- CONSTRUCTOR --------

    public Buses(int numeroRecorrido, String rutConductorAsociado, String patenteBus) {
        this.numeroRecorrido = numeroRecorrido;
        this.rutConductorAsociado = rutConductorAsociado;
        this.patenteBus = patenteBus;
    }

//--------- GET        --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public String getRutConductorAsociado() {
        return rutConductorAsociado;
    }

    public String getPatenteBus() {
        return patenteBus;
    }

//--------- SET        --------
    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setRutConductorAsociado(String rutConductorAsociado) {
        this.rutConductorAsociado = rutConductorAsociado;
    }

    public void setPatenteBus(String patenteBus) {
        this.patenteBus = patenteBus;
    }    

    // comportamientos

    public void conducir() {
        System.out.println("La micro " + patenteBus + " de patente " + patenteBus + " está en movimiento.");
    }
    
//--------- FUNCIONES ---------

//2.- AGREGAR DATO
    @Override
    public void agregar() {
        
    }

//3.- IMPRIMIR DATOS
    @Override
    public void imprimir() {
        
    }


//4.- MODIFICAR/ACTUALIZAR DATO
    @Override
    public void modificar() {
        
    }    

//System.out.println("5.- Eliminar");
    @Override
    public void eliminar() {
        

}