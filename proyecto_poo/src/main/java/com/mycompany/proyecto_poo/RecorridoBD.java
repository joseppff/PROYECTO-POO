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
public interface RecorridoBD {
    ArrayList<Recorrido>ListaRecorrido=new ArrayList<Recorrido>();
    public ArrayList<Recorrido> Leer(Connection link, int id);
}

