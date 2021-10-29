/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingjcda.modelos;

/**
 *
 * @author JESCOBAR
 */
public class Parqueadero {
    
    private int idParqueadero;
    private int cuposTotales;
    private int cuposDisponibles;
    private int cuposReservados;

    public Parqueadero() {
    }

    public Parqueadero(int idParqueadero, int cuposTotales, int cuposDisponibles, int cuposReservados) {
        this.idParqueadero = idParqueadero;
        this.cuposTotales = cuposTotales;
        this.cuposDisponibles = cuposDisponibles;
        this.cuposReservados = cuposReservados;
    }

    public int getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(int idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public int getCuposTotales() {
        return cuposTotales;
    }

    public void setCuposTotales(int cuposTotales) {
        this.cuposTotales = cuposTotales;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public int getCuposReservados() {
        return cuposReservados;
    }

    public void setCuposReservados(int cuposReservados) {
        this.cuposReservados = cuposReservados;
    }
    
    
    
}
