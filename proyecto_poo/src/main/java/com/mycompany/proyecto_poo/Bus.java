package com.mycompany.proyecto_poo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */

public class Bus extends BusFechaDisp implements Crud{
    // atributos de la micro
    private String patenteBus;
    private int nRecorrido;
    private ArrayList<Conductor> listaConductores = new ArrayList<>();
    
//-------- CONSTRUCTOR --------

    public Bus(String patenteBus, int nRecorrido, int horaInicio, int horaTermino) {
        super(horaInicio, horaTermino);
        this.patenteBus = patenteBus;
        this.nRecorrido = nRecorrido;
    }

   public Bus() {
        super();
    }


    //--------- GET y SET --------

    public String getPatenteBus() {
        return patenteBus;
    }

    public void setPatenteBus(String patenteBus) {
        this.patenteBus = patenteBus;
    }

    public int getnRecorrido() {
        return nRecorrido;
    }

    public void setnRecorrido(int nRecorrido) {
        this.nRecorrido = nRecorrido;
    }

    public ArrayList<Conductor> getListaConductores() {
        return listaConductores;
    }

    public void setListaConductores(ArrayList<Conductor> listaConductores) {
        this.listaConductores = listaConductores;
    }
    

    
    
    
    // comportamientos

    public void conducir() {
        System.out.println("La micro " + patenteBus + " de patente " + patenteBus + " está en movimiento.");
    }
    
//--------- FUNCIONES ---------

//2.- AGREGAR DATO
    @Override
    public void agregar() {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Ingrese Nuevos datos:");

        System.out.print("1.- Nombre del conductor: ");
        String nuevoNombre = Scanner.nextLine();
        System.out.print("2.- Apellido del conductor: ");
        String nuevoApellido = Scanner.nextLine();
        System.out.print("3.- Rut del conductor: ");
        String nuevoRut = Scanner.nextLine();
        System.out.print("4.- Bus a asignar: ");
        String busAsignado = Scanner.nextLine();
        Conductor nuevoConductor = new Conductor(nuevoNombre, nuevoApellido, nuevoRut, busAsignado);
        listaConductores.add(nuevoConductor);
        System.out.println("Operación Finalizada :D .");
    }

//3.- IMPRIMIR DATOS
    @Override
    public void imprimir() {
        for (int i = 0; i < listaConductores.size(); i++) {
            System.out.println("Nombre: " + listaConductores.get(i).getNombre());
            System.out.println("Apellido: " + listaConductores.get(i).getApellido());
            System.out.println("RUT: " + listaConductores.get(i).getRut());
        }
        System.out.println("Operación realizada exitosamente.");
    }


//4.- MODIFICAR/ACTUALIZAR DATO
    @Override
    public void modificar() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el rut del conductor a modificar: ");
        String rut = scanner.nextLine();
        boolean encontrado = false;

        for(int i = 0; i <= listaConductores.size(); i++){
            if(listaConductores.get(i).getRut().equals(rut)){
                encontrado = true;
                System.out.println("¿Que datos del conductor desea modificar?");
                System.out.println("1.- Nombre.");
                System.out.println("2.- Apellido.");
                System.out.println("3.- Rut.");
                
                int opcion = scanner.nextInt();
                switch(opcion){
                    case 1 -> {
                        System.out.println("Ingrese el nuevo nombre:");
                        String nombreConductor = scanner.nextLine();
                        listaConductores.get(i).setNombre(nombreConductor);
                        System.out.println("Nombre conductor actualizado correctamente");
                        //conductor.setNombre(nuevoNombre);
                    }
    
                    case 2 -> {
                        System.out.println("Ingrese el nuevo apellido:");
                        String apellidoConductor = scanner.nextLine();
                        listaConductores.get(i).setNombre(apellidoConductor);
                    }
    
                    case 3 -> {
                        System.out.println("Ingrese el nuevo rut:");
                        String rutConductor = scanner.nextLine();
                        listaConductores.get(i).setNombre(rutConductor);
                    }
    
                    default -> System.out.println("La opción que ingreso no es valida");
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún Conductor ingresado.");
        }
        System.out.println("Operación Finalizada :D .");
    }    

    //5.- ELIMINAR DATO CONDUCTOR
    @Override
    public void eliminar() {
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

    @Override
    public boolean crear(Connection link, Conductor conductor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}