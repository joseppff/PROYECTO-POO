/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface ConductorBD {
    ArrayList<Conductor>ListaConductor=new ArrayList<Conductor>();
    public boolean Crear(Connection link, Conductor conductor);
    public boolean Actualizar(Connection link, Conductor conductor);
    public boolean Eliminar(Connection link, String rut);
    public ArrayList<Conductor> Leer(Connection link);
    public Conductor Buscar(Connection link, String rut);
}

