/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingjcda.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author JESCOBAR
 */
public class ConsultasConductor extends ModeloBD {
    
     private PreparedStatement consultaSQL;
     private ResultSet resultadoSQL;
     
     Connection conexion = conectar();
     Conductor conductor = new Conductor();

    public ConsultasConductor() {
    }
     
        public boolean insertarConductor(Conductor conductor) {
              
        
        String query = "INSERT INTO conductor(id_cedula,nombres,telefono,celular) VALUES (?,?,?,?)";
        
        try{
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setInt(1, conductor.getIdCedula());
            consultaSQL.setString(2, conductor.getNombres());
            consultaSQL.setInt(3, conductor.getTelefono());
            consultaSQL.setInt(4, conductor.getCelular());
            
            int resultado = consultaSQL.executeUpdate();
            
            if(resultado>0){
                return true;
            }else{
                return false;
            }
                
        }catch(Exception error){
            System.out.println("upssss.. "+error);
            return false;
        }
        
    }
        
        public Conductor buscarConductor(int idCedula){        
       
        String query="SELECT * FROM conductor WHERE id_cedula=?";        
        
        try{            
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setInt(1,idCedula);
            
            resultadoSQL=consultaSQL.executeQuery();
            
            if(resultadoSQL.next()){
                
                conductor.setIdCedula(resultadoSQL.getInt("id_cedula"));
                conductor.setNombres(resultadoSQL.getString("nombres"));
                conductor.setTelefono(resultadoSQL.getInt("telefono"));
                conductor.setCelular(resultadoSQL.getInt("celular"));
                return conductor;
                
            }else{             
                return null;                
            }                
           
        }catch(Exception error){
            
            System.out.println("upssss.. "+error);
            return null;
        }       
          
   }
        
        
    
}
