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
public class profesor {
    public int id;
    public String nombre;
    public String apellido;
    
     public profesor(){
    this.id =0;
    this.nombre="";
    this.apellido="";

    }
           @Override
    public String toString(){
        return this.nombre+
                " , "+ this.id+
                " , "+this.apellido;
    }
}
