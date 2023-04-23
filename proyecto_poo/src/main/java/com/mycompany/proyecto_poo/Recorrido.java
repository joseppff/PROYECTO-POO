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

/*
    DATOS DE RECORRIDOS:
    Un recorrido es la linea de la micro, esta puede tener 2 o más micreros. 
    Ejem: 108 tiene a Juan y Antonio.

*/ 

public class Recorrido {
    //atributos de la micro
    private int Numero_recorrido;
    private String ConductorAsociadoUno;
    private String ConductorAsociadoDos;

    //Constructor
    public Recorrido(int Numero_recorrido, String ConductorAsociadoUno, String ConductorAsociadoDos) {
        this.Numero_recorrido = Numero_recorrido;
        this.ConductorAsociadoUno = ConductorAsociadoUno;
        this.ConductorAsociadoDos = ConductorAsociadoDos;
    }

    
    //Accesores
    public int getNumero_recorrido() {
        return Numero_recorrido;
    }

    public String getConductorAsociadoUno() {
        return ConductorAsociadoUno;
    }

    public String getConductorAsociadoDos() {
        return ConductorAsociadoDos;
    }
    
    //Mutadores
    public void setNumero_recorrido(int Numero_recorrido) {
        this.Numero_recorrido = Numero_recorrido;
    }

    public void setConductorAsociadoUno(String ConductorAsociadoUno) {
        this.ConductorAsociadoUno = ConductorAsociadoUno;
    }

    public void setConductorAsociadoDos(String ConductorAsociado2) {
        this.ConductorAsociadoDos = ConductorAsociado2;
    }
    
    
    
}
