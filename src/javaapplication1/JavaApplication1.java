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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante();
        e1.nombre="carlitos";
        e1.apellido="lopez";
        e1.id=1;
        System.out.println(e1.toString());
        curso e2 = new curso();
        e2.creditos=4;
        e2.id=1;
        e2.nombre="progra";
        System.out.println(e2.toString());
         profesor e3 = new profesor();
        e3.apellido="lopez";
        e3.id=1;
        e3.nombre="eduardo";
        System.out.println(e3.toString());
                       
    }
    
}
