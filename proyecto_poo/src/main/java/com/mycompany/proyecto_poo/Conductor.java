/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Conductor {
    
    private String nombre;
    private String apellido;
    private String rut;

    public static ArrayList<Conductor> listaConductores = new ArrayList<Conductor>();

    //-------- CONSTRUCTOR --------

    public Conductor(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }
    
    //--------- GET        --------

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    //--------- SET        --------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    //2.- AGREGAR CONDUCTOR
    public static void agregarConductor() {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Ingrese Nuevos datos:");

        System.out.print("1.- Nombre del conductor: ");
        String nombre = Scanner.nextLine();
        System.out.print("2.- Apellido del conductor: ");
        String apellido = Scanner.nextLine();
        System.out.print("3.- Rut del conductor: ");
        String rut = Scanner.nextLine();
        Conductor conductor = new Conductor(nombre, apellido, rut);
        listaConductores.add(conductor);
        System.out.println("Conductor agregado exitosamente.");
    }

    //3.- IMPRIMIR
    public void imprimirConductores(ArrayList<Conductor> conductores) {

        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Ingrese el RUT del conductor a imprimir:");
        String rutBucar = Scanner.nextLine();

        for (Conductor conductor : conductores) {
            if(rutBucar == conductor.getRut()){
                System.out.println("Nombre: " + conductor.getNombre());
                System.out.println("Apellido: " + conductor.getApellido());
                System.out.println("RUT: " + conductor.getRut());
                }
        }
        System.out.println("Operación realizada exitosamente.");
    }

    //4.- MODIFICAR ACTUALIZAR
    public void actualizarModificarConductor(String nuevoNombre, String nuevoApellido, String nuevoRut){

        int opcion;
        Scanner Entrada=new Scanner(System.in);

        System.out.println("¿Que datos del conductor desea modificar?");
        System.out.println("1.- Nombre.");
        System.out.println("2.- Apellido.");
        System.out.println("3.- Rut.");
        System.out.println("0.- Finalizar.");

        opcion=Entrada.nextInt();
        do{
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nuevo nombre:");
                    conductor.setNombre(nuevoNombre);
                break;

                case 2:
                    System.out.println("Ingrese el nuevo apellido:");
                    conductor.setApellido(nuevoApellido);

                break;

                case 3:
                    System.out.println("Ingrese el nuevo rut:");
                    conductor.setRut(nuevoRut);
                break;

                default: 
                    System.out.println("La opción que ingreso no es valida");
                break;
            }
        }while(opcion != 0);

        System.out.println("Operación Finalizada :D .");
    }
    //5.- ELIMINAR
}

//--------- comportamientos ---
