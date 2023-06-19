/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo.InicioSesion;
import java.sql.*;
/**
 *
 * @author diego
 */
public class ConexionBD {
    
    Connection cn;
    Statement st;
    
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/conductores","root","");
            System.out.print("ConexionEstablecida");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }return cn;
    }
    
}
