/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
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
import Modelos.BusBD;
import Modelos.Bus;
import static Modelos.BusBD.ListaBus;

/**
 *
 * @author diego
 */
public class BusG implements BusBD{
    public String query;
    
    @Override
    public ArrayList<Bus> Leer(Connection link){
        
        try{
            Statement s = link.createStatement();
            query="select * from buses";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
               Bus bus=new Bus();
               bus.setHoraInicio(rs.getInt("horainicio"));
               bus.setHoraTermino(rs.getInt("horatermino"));
               bus.setDiaSemana(rs.getString("diasemana"));
               bus.setPatenteBus(rs.getString("patente"));
               bus.setnRecorrido(rs.getInt("nRecorrido"));
               ListaBus.add(bus);
            }
            return ListaBus;
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public boolean Actualizar(Connection link, Bus bus) {
        try {
            Statement s = link.createStatement();
            query = "UPDATE buses SET horainicio='" + bus.getHoraInicio() + "', horatermino='" + bus.getHoraTermino()  + "', diasemana='" + bus.getDiaSemana()+ "', nrecorrido='" + bus.getnRecorrido() + "' WHERE patente='" + bus.getPatenteBus() + "'";
            s.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public Bus Buscar(Connection link, String patenteBus){
        Bus bus=new Bus();
        try {
            Statement s = link.createStatement();
            query="select * from buses where patente='"+patenteBus+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               bus.setHoraInicio(rs.getInt("horainicio"));
               bus.setHoraTermino(rs.getInt("horatermino"));
               bus.setDiaSemana(rs.getString("diasemana"));
               bus.setPatenteBus(rs.getString("patente"));
               bus.setnRecorrido(rs.getInt("nRecorrido"));
   
            }
            return bus;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public boolean Eliminar(Connection link, String patenteBus) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * buses where patente='"+patenteBus+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override
    public boolean Crear(Connection link, Bus bus){
        
        try{
            Statement s = link.createStatement();
            query = "INSERT INTO buses (horainicio, horatermino, diasemana, patente, nrecorrido) VALUES ('" + bus.getHoraInicio() + "', '" + bus.getHoraTermino() + "', '" + bus.getDiaSemana() + "', '" + bus.getPatenteBus() + "', " + bus.getnRecorrido() + ")";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
}