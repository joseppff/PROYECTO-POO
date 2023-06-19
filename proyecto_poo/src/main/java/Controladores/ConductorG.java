/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import com.mycompany.proyecto_poo.*;
import com.mycompany.proyecto_poo.InicioSesion.*;
/**
 *
 * @author diego
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class ConductorG implements Crud {
    public String query;
    
    public ArrayList<Conductor> Leer(Connection link){
        
        Conductor conductor=new Conductor();
        try{
            Statement s = link.createStatement();
            query="select * from Conductores";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
                
               conductor.setNombre(rs.getString("nombre"));
               conductor.setApellido(rs.getString("apellido"));
               conductor.setRut(rs.getString("rut"));
               
               ListaConductor.add(conductor);
                
            }
            
            return ListaConductor;
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void Actualizardato(){
        
    }
    
    public void EliminarDato(){
        
    }
    
    public boolean Crear(Connection link, Conductor conductor){
        
        try{
            Statement s = link.createStatement();
            query="insert into Conductores(nombres,apellido,rut)values('"+conductor.getNombre()+"','"+conductor.getApellido()+"','"+conductor.getRut()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
}