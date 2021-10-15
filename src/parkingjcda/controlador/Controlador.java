/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingjcda.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import parkingjcda.modelos.ModeloBD;
import parkingjcda.vistas.Vista;

/**
 *
 * @author JESCOBAR
 */
public class Controlador implements ActionListener {
    
    ModeloBD modelo = new ModeloBD();
    Vista vista = new Vista();

    public Controlador(ModeloBD modelo, Vista vista) {
        this.modelo=modelo;
        this.vista=vista;
        vista.button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        modelo.conectar();
        
    }
    
    
    
}
