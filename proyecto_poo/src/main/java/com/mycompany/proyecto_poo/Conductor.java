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
        System.out.println("Operación Finalizada :D .");
    }

    //3.- IMPRIMIR
    public void imprimirConductores() {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese el RUT del conductor a imprimir:");
        String rutBucar = scanner.nextLine();
        boolean encontrado = false;

        for (Conductor conductor : listaConductores) {
            if(rutBucar == conductor.getRut()){
                encontrado = true;
                System.out.println("Nombre: " + conductor.getNombre());
                System.out.println("Apellido: " + conductor.getApellido());
                System.out.println("RUT: " + conductor.getRut());
                }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún Conductor ingresado.");
        }
        System.out.println("Operación realizada exitosamente.");
    }

    //4.- MODIFICAR ACTUALIZAR
    public void actualizarModificarConductor(){

        int opcion;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el rut del conductor a modificar: ");
        String rut = scanner.nextLine();
        boolean encontrado = false;

        for(Conductor conductor : listaConductores){
            if(conductor.getRut().equals(rut)){
                encontrado = true;
                System.out.println("¿Que datos del conductor desea modificar?");
                System.out.println("1.- Nombre.");
                System.out.println("2.- Apellido.");
                System.out.println("3.- Rut.");
                System.out.println("0.- Finalizar.");

                opcion=scanner.nextInt();
                scanner.nextLine();
                switch(opcion){
                    case 0:

                    break;

                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nombreConductor = scanner.nextLine();
                        scanner.nextLine();
                        conductor.setNombre(nombreConductor);
                        System.out.println("Nombre conductor actualizado correctamente");
                        //conductor.setNombre(nuevoNombre);
                    break;
    
                    case 2:
                        System.out.println("Ingrese el nuevo apellido:");
                        String apellidoConductor = scanner.nextLine();
                        scanner.nextLine();
                        conductor.setNombre(apellidoConductor);
                        //conductor.setApellido(nuevoApellido);
    
                    break;
    
                    case 3:
                        System.out.println("Ingrese el nuevo rut:");
                        String rutConductor = scanner.nextLine();
                        scanner.nextLine();
                        conductor.setNombre(rutConductor);
                        
                        //conductor.setRut(nuevoRut);
                    break;
    
                    default: 
                        System.out.println("La opción que ingreso no es valida");
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún Conductor ingresado.");
        }
        System.out.println("Operación Finalizada :D .");
    }
    //5.- ELIMINAR

    public static void eliminar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el RUT del conductor a eliminar: ");
        String rutEliminar = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < listaConductores.size(); i++) {
            if (listaConductores.get(i).getRut().equals(rutEliminar)) {
                listaConductores.remove(i);
                System.out.println("Conductor eliminado exitosamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún Conductor con el RUT ingresado.");
        }
        System.out.println("Operación Finalizada :D .");
    }

}



//--------- comportamientos ---
