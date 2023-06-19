/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author pete-
 */
public interface Crud {
    ArrayList<Conductor>ListaConductor=new ArrayList<Conductor>();
    public abstract void agregar();
    public boolean crear(Connection link, Conductor conductor);
    public abstract void imprimir();
    public abstract void modificar();
    public abstract void eliminar();
}