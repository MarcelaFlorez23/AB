/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Laboratorio
 */
public class persona {
   

    public String nombre;
    public String apellido;
     public int id;
    String horario;
  
     

    public persona(){

    this.nombre="";
    this.apellido="";
    this.id =0;
    }

    @Override
    public String toString(){
        return this.nombre+
                " , "+ this.apellido+
                " , "+this.id;
    }
    }

