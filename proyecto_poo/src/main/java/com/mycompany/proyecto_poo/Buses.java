package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Buses {
    // atributos de la micro
    private int idBus;
    private int idConductorAsociado;
    private String patenteBus;
    
//-------- CONSTRUCTOR --------
    public Buses(int idBus, String patenteBus, int idConductorAsociado) {
        this.idBus = idBus;
        this.patenteBus = patenteBus;
        this.idConductorAsociado = idConductorAsociado;
    }
//--------- GET        --------

    public int getIdBus() {
        return idBus;
    }

    public int getIdConductorAsociado() {
        return idConductorAsociado;
    }

    public String getPatenteBus() {
        return patenteBus;
    }

//--------- SET        --------

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public void setIdConductorAsociado(int idConductorAsociado) {
        this.idConductorAsociado = idConductorAsociado;
    }

    public void setPatenteBus(String patenteBus) {
        this.patenteBus = patenteBus;
    }

//--------- comportamientos ---
    public void conducir() {
        System.out.println("La micro " + patenteBus + " de id " + idBus + " está en movimiento.");
    }
    
//--------- FUNCIONES ---------
    
    
}
