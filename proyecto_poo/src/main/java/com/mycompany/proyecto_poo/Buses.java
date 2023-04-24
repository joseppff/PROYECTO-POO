package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Scanner;


/*
    DATOS BUS:
    Una micro tiene un conductor asignado, matricula y linea.

*/ 

public class Buses {
    // atributos de la micro
    private int numeroRecorrido;
    private String rutConductorAsociado;
    private String patenteBus;
    
    public static ArrayList<Buses> listaBuses = new ArrayList<Buses>();
    
//-------- CONSTRUCTOR --------

    public Buses(int numeroRecorrido, String rutConductorAsociado, String patenteBus) {
        this.numeroRecorrido = numeroRecorrido;
        this.rutConductorAsociado = rutConductorAsociado;
        this.patenteBus = patenteBus;
    }

//--------- GET        --------

    public int getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public String getRutConductorAsociado() {
        return rutConductorAsociado;
    }

    public String getPatenteBus() {
        return patenteBus;
    }

//--------- SET        --------
    public void setNumeroRecorrido(int numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    public void setRutConductorAsociado(String rutConductorAsociado) {
        this.rutConductorAsociado = rutConductorAsociado;
    }

    public void setPatenteBus(String patenteBus) {
        this.patenteBus = patenteBus;
    }    

    // comportamientos

    public void conducir() {
        System.out.println("La micro " + patenteBus + " de patente " + patenteBus + " está en movimiento.");
    }
    
//--------- FUNCIONES ---------

//2.- AGREGAR DATO
    public static void agregarBus() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese Nuevos datos:");
        
        System.out.print("1.- Número de recorrido.");
        int numeroRecorrido = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        System.out.print("2.- Patente del bus.");
        String patenteBus = scanner.nextLine();
        System.out.print("3.- Rut del conductor asociado al bus.");
        String rutConductorAsociado = scanner.nextLine();
        
        Buses bus = new Buses(numeroRecorrido, patenteBus, rutConductorAsociado);
        listaBuses.add(bus);
        System.out.println("Bus agregado exitosamente.");
    }

//3.- IMPRIMIR DATOS
public static void imprimirBus() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la patente del bus que desea imprimir: ");
    String patente = scanner.nextLine();
    boolean encontrado = false;
    for (Buses bus : listaBuses) {
        if (bus.getPatenteBus().equals(patente)) {
            System.out.println("Número de recorrido: " + bus.getNumeroRecorrido());
            System.out.println("RUT del conductor asociado: " + bus.getRutConductorAsociado());
            System.out.println("Patente del bus: " + bus.getPatenteBus());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró un bus con la patente ingresada.");
    }
}


//4.- MODIFICAR/ACTUALIZAR DATO
public void actualizarModificarBuses() {
    int opcion;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la patente del bus a modificar: ");
    String patente = scanner.nextLine();

    for (Buses bus : listaBuses) {
        if (bus.getPatenteBus().equals(patente)) {
            System.out.println("¿Qué dato del bus desea modificar?");
            System.out.println("1.- Número de recorrido");
            System.out.println("2.- RUT del conductor asociado");
            System.out.println("3.- Patente del bus");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo número de recorrido:");
                    int numeroRecorrido = scanner.nextInt();
                    scanner.nextLine();
                    bus.setNumeroRecorrido(numeroRecorrido);
                    System.out.println("Número de recorrido actualizado correctamente");
                    break;

                case 2:
                    System.out.println("Ingrese el nuevo RUT del conductor asociado:");
                    String rutConductor = scanner.nextLine();
                    bus.setRutConductorAsociado(rutConductor);
                    System.out.println("RUT del conductor asociado actualizado correctamente");
                    break;

                case 3:
                    System.out.println("Ingrese la nueva patente del bus:");
                    String patenteNueva = scanner.nextLine();
                    bus.setPatenteBus(patenteNueva);
                    System.out.println("Patente del bus actualizada correctamente");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida");
                    break;
            }
            return;
        }
    }
    System.out.println("No se encontró ningún bus con la patente ingresada");
}

    

//System.out.println("5.- Eliminar");
public static void eliminarBus() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la patente del bus que desea eliminar: ");
    String patente = scanner.nextLine();
    boolean encontrado = false;
    
    for (int i = 0; i < listaBuses.size(); i++) {
        Buses bus = listaBuses.get(i);
        if (bus.getPatenteBus().equals(patente)) {
            listaBuses.remove(i);
            System.out.println("Se ha eliminado el bus con patente " + patente + " de la lista de buses.");
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró un bus con la patente ingresada.");
    }
}

}