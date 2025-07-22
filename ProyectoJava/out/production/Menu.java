/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Menu {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        System.out.println("\n----- MENU PRINCIPAL -----");
        System.out.println("\n Bienvenido al menu principal ");
     
       int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opcion que desee: \n1. Registro de Clientes \n2. Venta de Paquetes \n3. Facturacion \n4. Reservas \n5. Historial \n6. Salir", "Eleccion de opcion "));
        
        if (opcion == 1) {
            Registro();
        } else if (opcion == 2) {
            Paquetes();
        } else if (opcion == 3) {
            Facturacion();
        } else if (opcion == 4) {
            Reservas();
        } else if (opcion == 5) {
            Historial();
        } else if (opcion == 6) {
         System.out.println("Gracias por la visita,hasta luego"); 
        }
            
        }
          
    }

