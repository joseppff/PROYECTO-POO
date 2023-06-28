/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
package Modelos;

/**
 *
 * @author pete-
 */
public abstract class BusFechaDisp {
    private int horaInicio;
    private int horaTermino;
    private String diaSemana;

    public BusFechaDisp(int horaInicio, int horaTermino, String diaSemana) {
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.diaSemana = diaSemana;
    }


    
    
    public BusFechaDisp() {
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }


}