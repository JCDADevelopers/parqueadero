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
public class ConsultasVehiculo extends ModeloBD {
    
     private PreparedStatement consultaSQL;
     private ResultSet resultadoSQL;
     
     Connection conexion = conectar();
     Vehiculo vehiculo = new Vehiculo();

    public ConsultasVehiculo() {
    }
     
      public boolean insertarVehiculo(Vehiculo vehiculo) {
              
        
        //armamos la consulta
        String query = "INSERT INTO vehiculo(placa,fecha_ingreso,fecha_salida,valor_pagar,id_parqueadero,id_cedula) VALUES (?,?,?,?,?,?)";
        
        //intento ejecutar la consulta BD
        try{
            //preparo la consulta en la BD
            consultaSQL=conexion.prepareStatement(query);
            
            //organizo los datos que voy a ingresar en los ?
            consultaSQL.setString(1, vehiculo.getPlaca());
            consultaSQL.setString(2, vehiculo.getFechaIngreso());
            consultaSQL.setString(3, vehiculo.getFechaSalida());
            consultaSQL.setInt(4, vehiculo.getValorPagar());
            consultaSQL.setInt(5, vehiculo.getIdParqueadero());
            consultaSQL.setInt(6, vehiculo.getIdCedula());
            
            //ejecuto la consulta preparada
            int resultado = consultaSQL.executeUpdate();
            
            //valido el resultado
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
      
      public Vehiculo buscarVehiculo(String placa){        
       
        String query="SELECT * FROM vehiculo WHERE placa=?";        
        
        try{            
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setString(1,placa);
            
            resultadoSQL=consultaSQL.executeQuery();
            
            if(resultadoSQL.next()){
                
                vehiculo.setPlaca(resultadoSQL.getString("placa"));
                vehiculo.setFechaIngreso(resultadoSQL.getString("fecha_ingreso"));
                vehiculo.setFechaSalida(resultadoSQL.getString("fecha_salida"));
                vehiculo.setValorPagar(resultadoSQL.getInt("valor_pagar"));
                vehiculo.setIdParqueadero(resultadoSQL.getInt("id_parqueadero"));
                vehiculo.setIdCedula(resultadoSQL.getInt("id_cedula"));
                return vehiculo;
                
            }else{             
                return null;                
            }                
           
        }catch(Exception error){
            
            System.out.println("upssss.. "+error);
            return null;
        }  
        
       
       
       
   }
    
    
    
}
