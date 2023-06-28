/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import Modelos.Recorrido;
import static Modelos.RecorridoBD.ListaRecorrido;

/**
 *
 * @author diego
 */
public class RecorridoG {
        public String query;
        public ArrayList<Recorrido> Leer(Connection link){
            
            try{
            Statement s = link.createStatement();
            query="select * from Recorridos";
            ResultSet rs=s.executeQuery(query);
                while (rs.next()){
                   Recorrido recorrido=new Recorrido();
                   recorrido.setNumeroRecorrido(rs.getInt("numerorecorrido"));
                   recorrido.setNombreRecorrido(rs.getString("nombrerecorrido"));
                   ListaRecorrido.add(recorrido);

                }
            
            return ListaRecorrido;
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
       }

        
        public int Buscar(Connection link, String nombrerecorrido){
            int id=0;
            try{
            Statement s = link.createStatement();
            query="select * from Recorridos where recorrido='"+nombrerecorrido+"'";
            ResultSet rs=s.executeQuery(query);
                while (rs.next()){
                   
                   id=rs.getInt("nombrerecorrido");
                   

                }
            
              return id;
           }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            return 0;
        }
        
        
}