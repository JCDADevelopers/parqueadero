/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingjcda.modelos;

/**
 *
 * @author JESCOBAR
 */
public class Conductor {
    
    private int idCedula;
    private String nombres;
    private int telefono;
    private int celular;

    public Conductor() {
    }

    public Conductor(int idCedula, String nombres, int telefono, int celular) {
        this.idCedula = idCedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.celular = celular;
    }

    public int getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(int idCedula) {
        this.idCedula = idCedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
}
