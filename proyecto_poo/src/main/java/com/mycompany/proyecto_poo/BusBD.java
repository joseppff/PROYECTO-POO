/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface BusBD {
    ArrayList<Bus>ListaBus=new ArrayList<Bus>();
    public boolean Crear(Connection link, Bus bus);
    public boolean Actualizar(Connection link, Bus bus);
    public boolean Eliminar(Connection link, String patente);
    public ArrayList<Bus> Leer(Connection link);
    public Bus Buscar(Connection link, String patente);
}

