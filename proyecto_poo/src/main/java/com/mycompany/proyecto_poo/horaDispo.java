/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

/**
 *
 * @author pete-
 */
public abstract class horaDispo {
    private int horaInicio;
    private int horaTermino;

    public horaDispo(int horaInicio, int horaTermino) {
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }
}
