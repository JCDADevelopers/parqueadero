/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingjcda;

import parkingjcda.controlador.Controlador;
import parkingjcda.modelos.ModeloBD;
import parkingjcda.vistas.Vista;

/**
 *
 * @author JESCOBAR
 */
public class ParkingJCDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloBD modelo = new ModeloBD();
        Vista vista = new Vista();
        vista.setVisible(true);
        
        Controlador controlador = new Controlador(modelo,vista);
        
    }
    
}
