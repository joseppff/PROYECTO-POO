/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
 

public class Recorrido implements Crud{
    private int numeroRecorrido;
    private int cantParadas;
    private ArrayList<Parada> listaParadas = new ArrayList<Parada>();
    private ArrayList<Bus> listaBuses = new ArrayList<Bus>();
    
//-------- CONSTRUCTOR --------/

    public Recorrido(int numeroRecorrido, int cantParadas, ArrayList listaParadas) {
        this.numeroRecorrido = numeroRecorrido;
        this.cantParadas = cantParadas;
        this.listaParadas = listaParadas;
    }
    
    public Recorrido() {
    }
    
    public Recorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

//--------- GET y SET --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public int getCantParadas() {
        return cantParadas;
    }

    public ArrayList<Parada> getListaParadas() {
        return listaParadas;
    }

    public ArrayList<Bus> getListaBuses() {
        return listaBuses;
    }

    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setCantParadas(int cantParadas) {
        this.cantParadas = cantParadas;
    }

    public void setListaParadas(ArrayList<Parada> listaParadas) {
        this.listaParadas = listaParadas;
    }

    public void setListaBuses(ArrayList<Bus> listaBuses) {
        this.listaBuses = listaBuses;
    }

//2.- IMPRIMIR DATOS BUSES
    @Override
    public void agregar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Ingrese Nuevos datos:");
        System.out.print("1.- Patente del bus.");
        String patenteBus = scanner.nextLine();
        System.out.print("Ingrese idRecorrido");
        int nRecorrido = scanner.nextInt();
        System.out.print("2.- Hora de inicio: ");
        int nuevoInicio = scanner.nextInt();
        System.out.print("3.- Hora de final: ");
        int nuevoFinal = scanner.nextInt();
        
        Bus nuevoBus = new Bus(patenteBus, nRecorrido, nuevoInicio, nuevoFinal);
        listaBuses.add(nuevoBus);
        System.out.println("Operación Finalizada :D .");
    }

//3.- IMPRIMIR DATOS BUSES
    @Override
    public void imprimir() {
        for (int i = 0; i <= listaBuses.size(); i++) {
            System.out.println("Patente del bus: " + listaBuses.get(i).getPatenteBus());
        }
        System.out.println("Operación realizada exitosamente.");
    }

//4.- MODIFICAR/ACTUALIZAR DATO BUSES
    @Override
    public void modificar() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la patente del bus a modificar: ");
        String moificarPatente = scanner.nextLine();

        for (int i = 0; i <= listaBuses.size(); i++) {
            if (listaBuses.get(i).getPatenteBus().equals(moificarPatente)) {
                System.out.println("Ingrese la nueva Patente del bus a modificar:");
                String patenteNueva = scanner.nextLine();
                listaBuses.get(i).setPatenteBus(patenteNueva);
                return;
            }
        }
        System.out.println("Operación Finalizada :D .");    
    }

    //5.- ELIMINAR DATO BUS
    @Override
    public void eliminar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la patente del bus que desea eliminar: ");
        String patente = scanner.nextLine();
        boolean encontrado = false;
        
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPatenteBus().equals(patente)) {
                listaBuses.remove(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un bus con la patente ingresada.");
        }
        System.out.println("Operación Finalizada :D .");   
    }

    @Override
    public boolean crear(Connection link, Conductor conductor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}