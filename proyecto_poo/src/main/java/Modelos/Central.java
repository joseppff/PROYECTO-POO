/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pete-
 */
public class Central implements Crud{
    private ArrayList<Recorrido> listaRecorridos = new ArrayList<Recorrido>();
    
    //--------- FUNCIONES ---------
//2.- AGREGAR DATO RECORRIDO
    @Override
    public void agregar(){
            
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Ingrese Nuevos datos:");
        
        System.out.printf("1.- Número de recorrido.");
        int numeroRecorrido = Scanner.nextInt();
        
        System.out.printf("2.- Cantidad de paradas.");
        int cantParadas = Scanner.nextInt();
        
        System.out.println("Ingrese los nombres de las paradas :");
        ArrayList<String> nuevaListaParadas = new ArrayList<String>();
        for (int i = 1; i <= cantParadas; i++) {
            String parada = Scanner.nextLine();
            nuevaListaParadas.add(parada);
        }
        
        Recorrido nuevoRecorrido = new Recorrido(numeroRecorrido, cantParadas, nuevaListaParadas);
        listaRecorridos.add(nuevoRecorrido);
        
        System.out.println("Operación Finalizada :D .");
    }
//3.- IMPRIMIR DATOS RECORRIDO
    @Override
    public void imprimir() {
        for (int i = 0; i <= listaRecorridos.size(); i++) {
                System.out.println("Número de recorrido: " + listaRecorridos.get(i).getNumeroRecorrido());
                System.out.println("Cantidad de paradas: " + listaRecorridos.get(i).getCantParadas());
                System.out.println(listaRecorridos.get(i).getCantParadas());
        }
        System.out.println("Operación Finalizada :D .");
    }

//4.- MODIFICAR/ACTUALIZAR DATO BUSES
    @Override
    public void modificar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número de recorrido: ");
        int numeroBuscar = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i <= listaRecorridos.size(); i++) {
            if (listaRecorridos.get(i).getNumeroRecorrido() == numeroBuscar) {
                encontrado = true;
                System.out.println("¿Qué dato desea modificar?");
                System.out.println("1. Cantidad de paradas");
                System.out.println("2. Nombre de paradas");

                int opcion = scanner.nextInt();
                switch(opcion) {
                    case 1:
                        System.out.println("Ingrese el numero del recorrido:");
                        int nuevoNum = scanner.nextInt();
                        listaRecorridos.get(i).setNumeroRecorrido(nuevoNum);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad paradas:");
                        int nuevaCantidad = scanner.nextInt();
                        listaRecorridos.get(i).setCantParadas(nuevaCantidad);
                        break;
                    default: 
                        System.out.println("La opción que ingreso no es valida");
                    break;         
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún Recorrido ingresado.");
        }
        System.out.println("Operación Finalizada :D .");
    }

//5.- ELIMINAR DATO BUSES
    @Override
    public void eliminar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de recorrido que desea eliminar: ");
        int eliminarRecorrido = scanner.nextInt();
        boolean encontrado = false;
        
        for (int i = 0; i <= listaRecorridos.size(); i++) {
            if(listaRecorridos.get(i).getNumeroRecorrido() == eliminarRecorrido) {
                listaRecorridos.remove(i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún recorrido");
        }
        
        System.out.println("Operación Finalizada :D .");
    }

    @Override
    public boolean crear(Connection link, Conductor conductor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
