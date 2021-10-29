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
public class ConsultasParqueadero extends ModeloBD {
    
     private PreparedStatement consultaSQL;
     private ResultSet resultadoSQL;
     
     Connection conexion = conectar();
     Parqueadero parqueadero = new Parqueadero();

    public ConsultasParqueadero() {
    }
     
      public boolean insertarParqueadero(Parqueadero parqueadero) {
              
        
        String query = "INSERT INTO parqueadero(id_parqueadero,cupos_totales,cupos_disponibles,cupos_reservados) VALUES (?,?,?,?)";
        
        try{
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setInt(1, parqueadero.getIdParqueadero());
            consultaSQL.setInt(2, parqueadero.getCuposTotales());
            consultaSQL.setInt(3, parqueadero.getCuposDisponibles());
            consultaSQL.setInt(4, parqueadero.getCuposReservados());
            
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
      
      public Parqueadero buscarParqueadero(int idParqueadero){        
       
        String query="SELECT * FROM parqueadero WHERE id_parqueadero=?";        
        
        try{            
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setInt(1,idParqueadero);
            
            resultadoSQL=consultaSQL.executeQuery();
            
            if(resultadoSQL.next()){
                
                parqueadero.setIdParqueadero(resultadoSQL.getInt("id_parqueadero"));
                parqueadero.setCuposTotales(resultadoSQL.getInt("cupos_totales"));
                parqueadero.setCuposDisponibles(resultadoSQL.getInt("cupos_disponibles"));
                parqueadero.setCuposReservados(resultadoSQL.getInt("cupos_reservados"));
                return parqueadero;
                
            }else{             
                return null;                
            }                
           
        }catch(Exception error){
            
            System.out.println("upssss.. "+error);
            return null;
        }       
          
   }
    
    
    
}
