/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingjcda.modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JESCOBAR
 */
public class ModeloBD {
    
    private String servidorBD="jdbc:mysql://localhost/parqueaderobd";
    private String usuarioBD="root";
    private String passwordBD="";
    
    public ModeloBD() {
    }
    
    public Connection conectar(){
        
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidorBD,usuarioBD,passwordBD);
            System.out.println("Exito conectandonos");
            return conexion;
            
        }catch(Exception error){
            System.out.println("upss.. "+error);
            return null;
        }
        
    }
    
    
    
}
