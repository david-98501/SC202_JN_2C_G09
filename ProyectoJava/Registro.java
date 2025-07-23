/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;
 import javax.swing.*;
/**
 *
 * @author HP
 */
public class Registro {
     Registro[] registro = new Registro [50];
    
   //private String[] nombre;
    //private long[] cedula;
    //private long[] celular;
      
     
     
    private String[] nombre = new String[50];
    private long[] cedula = new long[50];
    private long[] celular = new long[50];
    private String[] correo = new String[50];
    private String[] direccion = new String[50];

    
    
    // constructor
    public Registro(){}

    // get y set

    public String[] getnombre(){
        return nombre;
    }
    public void setNombre(String[] nombre){
        this.nombre=nombre;
    }

    public long[] getCedula(){
        return cedula;
    }
    public void setCedula(long[] cedula){
        this.cedula=cedula;
    }

    public long[] getCelular(long[] celular){
        return celular;
    }

    public String[] getCorreo(){
        return correo;
    }
    public void setCorreo(String[] correo){
        this.correo=correo;
    }

    public String[] getDireccion(){
        return direccion;
    }
    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }


    //metodo verificador de edad
    public boolean edad() {
        int lectura1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor introduzca su edad"));

        if (lectura1 >= 18) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
            return true; // Puede continuar
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, por políticas del hotel no registramos menores de edad");
            return false;}

    }

    // metodo mostrar datos

    public void mostarregistro(){
        JOptionPane.showMessageDialog(null,"su nommbre es : "+ getnombre());




    }




















}

    

