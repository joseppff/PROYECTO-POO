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
 

public class Recorrido {
    private int numeroRecorrido;
    private int cantParadas;
    private String nombreParadas;
    private ArrayList<String> listaParadas;

    public static ArrayList<Recorrido> nuevaListaParadas = new ArrayList<Recorrido>();
    
//-------- CONSTRUCTOR --------

    public Recorrido(int numeroRecorrido, int cantParadas, String nombreParadas, ArrayList<String> listaParadas) {
        this.numeroRecorrido = numeroRecorrido;
        this.cantParadas = cantParadas;
        this.nombreParadas = nombreParadas;
        this.listaParadas = listaParadas;
    }
    
//--------- GET        --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public int getCantParadas() {
        return cantParadas;
    }

    public String getNombreParadas() {
        return nombreParadas;
    }

    public ArrayList<String> getListaParadas() {
        return listaParadas;
    }
    
    //Mutadores
    //Mutadores

    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setCantParadas(int cantParadas) {
        this.cantParadas = cantParadas;
    }

    public void setNombreParadas(String nombreParadas) {
        this.nombreParadas = nombreParadas;
    }   
    
//--------- FUNCIONES
//--------- FUNCIONES ---------

//2.- AGREGAR DATO
    public static void agregarRecorrido(){
            
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Ingrese Nuevos datos:");
        
        System.out.printf("1.- Número de recorrido.");
        int numeroRecorrido = Scanner.nextInt();
        
        System.out.printf("2.- Cantidad de paradas.");
        int cantParadas = Scanner.nextInt();
        Scanner.nextLine(); // Limpiar buffer
        
        System.out.println("Ingrese el nombre de las paradas:");
        String nombreParadas = Scanner.nextLine();
        
        ArrayList<String> listaParadas = new ArrayList<String>();
        for (int i = 1; i <= cantParadas; i++) {
            System.out.println("Ingrese el nombre de la parada " + i + ":");
            String parada = Scanner.nextLine();
            listaParadas.add(parada);
        }
        
        Recorrido nuevoRecorrido = new Recorrido(numeroRecorrido, cantParadas, nombreParadas, listaParadas);
        nuevaListaParadas.add(nuevoRecorrido);
        
        System.out.println("¡Recorrido agregado con éxito!");
    }

//3.- IMPRIMIR DATOS

    public static void imprimirRecorrido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número de recorrido: ");
        int numeroRecorrido = scanner.nextInt();
        boolean encontrado = false;

        for (Recorrido recorrido : listaParadas) {
            if (recorrido.getNumeroRecorrido() == numeroRecorrido) {
                encontrado = true;
                System.out.println("Número de recorrido: " + recorrido.getNumeroRecorrido());
                System.out.println("Cantidad de paradas: " + recorrido.getCantParadas());

                for (Recorrido paradero : recorrido.getCantParadas()) {
                    System.out.println("- " + recorrido.nombreParadas);
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún recorrido con ese número.");
        }
    }

//4.- Actualizar/Modificar Datos
    public static void modificarRecorrido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número de recorrido: ");
        int numeroRecorrido = scanner.nextInt();
        boolean encontrado = false;

        for (Recorrido recorrido : listaParadas) {
            if (recorrido.getNumeroRecorrido() == numeroRecorrido) {
                encontrado = true;
                System.out.println("¿Qué dato desea modificar?");
                System.out.println("1. Cantidad de paradas");
                System.out.println("2. Nombre de paradas");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
                switch(opcion) {
                    case 1:
                        System.out.println("Ingrese nueva cantidad de paradas:");
                        int nuevaCantidad = scanner.nextInt();
                        recorrido.setCantParadas(nuevaCantidad);
                        break;
                    case 2:
                        System.out.println("Ingrese nuevo nombre de paradas:");
                        String nuevoNombre = scanner.nextLine();
                        recorrido.setNombreParadas(nuevoNombre);
                        break;
                    default: 
                        System.out.println("La opción que ingreso no es valida");
                    break;         
                }
            }
        }

    }

//5.- Eliminar
    public static void eliminarRecorrido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de recorrido que desea eliminar: ");
        String patente = scanner.nextLine();
        boolean encontrado = false;
        
        for (Recorrido recorrido : listaParadas) {
            if (recorrido.getPatenteBus().equals(patente)) {
                listaParadas.remove(recorrido);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El recorrido con patente " + patente + " ha sido eliminado.");
        } else {
            System.out.println("No se encontró ningún recorrido con patente " + patente + ".");
        }
    }
}