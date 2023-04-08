/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/jorge","root","21364m");
            if (c != null) {
                System.out.println("Conexión exitosa a la base de datos MySQL");
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos MySQL");
}
        }catch(Exception e){
            System.out.println(e);
        
            System.out.println(e);
    }
        
        System.out.println("Fin");
   
    
}
}
