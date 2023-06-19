/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
 

public class Recorrido implements Crud{
    private int numeroRecorrido;
    private int cantParadas;
    private ArrayList<String> listaParadas = new ArrayList<String>();
    private ArrayList<Buses> listaBuses = new ArrayList<Buses>();
    
//-------- CONSTRUCTOR --------/

    public Recorrido(int numeroRecorrido, int cantParadas, ArrayList listaParadas) {
        this.numeroRecorrido = numeroRecorrido;
        this.cantParadas = cantParadas;
        this.listaParadas = listaParadas;
    }

//--------- GET y SET --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public int getCantParadas() {
        return cantParadas;
    }

    public ArrayList<String> getListaParadas() {
        return listaParadas;
    }

    public ArrayList<Buses> getListaBuses() {
        return listaBuses;
    }

    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setCantParadas(int cantParadas) {
        this.cantParadas = cantParadas;
    }

    public void setListaParadas(ArrayList<String> listaParadas) {
        this.listaParadas = listaParadas;
    }

    public void setListaBuses(ArrayList<Buses> listaBuses) {
        this.listaBuses = listaBuses;
    }

//2.- IMPRIMIR DATOS BUSES
    @Override
    public void agregar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Ingrese Nuevos datos:");
        System.out.print("1.- Patente del bus.");
        String patenteBus = scanner.nextLine();
        
        Buses nuevoBus = new Buses(patenteBus);
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
}