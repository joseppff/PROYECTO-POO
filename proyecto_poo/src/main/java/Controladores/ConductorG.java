/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import com.mycompany.proyecto_poo.CrudBD;
import com.mycompany.proyecto_poo.Conductor;
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
public class ConductorG implements CrudBD {
    public String query;
    
    public ArrayList<Conductor> Leer(Connection link){
        
        try{
            Statement s = link.createStatement();
            query="select * from conductores";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
               Conductor conductor=new Conductor();
               conductor.setNombre(rs.getString("nombre"));
               conductor.setApellido(rs.getString("apellido"));
               conductor.setRut(rs.getString("rut"));
               conductor.setPatenteAsociada(rs.getString("patenteAsociada"));
               ListaConductor.add(conductor);
               
            }
            
            return ListaConductor;
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean Actualizar(Connection link, Conductor conductor){
        try{
            Statement s = link.createStatement();
            query="UPDATE conductores set nombre='"+conductor.getNombre()+"',apellido='"+conductor.getApellido()+"',rut='"+conductor.getRut()+"',patenteasociada='"+conductor.getPatenteAsociada()+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
       
    }
    
    public Conductor Buscar(Connection link, String rut){
        Conductor conductor=new Conductor();
        try {
            Statement s = link.createStatement();
            query="select * from conductores where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               conductor.setRut(rs.getString("rut"));
               conductor.setNombre(rs.getString("nombre"));
               conductor.setApellido(rs.getString("apellido"));
               conductor.setPatenteAsociada(rs.getString("patenteAsociada"));
   
            }
            return conductor;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean Eliminar(Connection link, String rut) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * conductores where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public boolean Crear(Connection link, Conductor conductor){
        
        try{
            Statement s = link.createStatement();
            query="insert into conductores(Nombre,Apellido,Rut,PatenteAsociada)values('"+conductor.getNombre()+"','"+conductor.getApellido()+"','"+conductor.getRut()+"','"+conductor.getPatenteAsociada()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
}