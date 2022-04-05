/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios20.classes;

/**
 *
 * @author alumno
 */
public class Transporte {
    private final String id;
    private final int anoCompra;
    private static double precio;
    private double monedero;
    private int capacidad;
    private int pasajeros;

    public Transporte(String id, int anoCompra, int capacidad) {
        this.id = id;
        this.anoCompra = anoCompra;
        this.capacidad = capacidad;
        this.monedero = 0;
        this.pasajeros = 0;
    }

    public String getId() {
        return id;
    }
    
    
    
    public boolean subirPasajero(){
        if (pasajeros < capacidad) {
            pasajeros++;
            monedero += precio;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean subirBajar(){
        if (pasajeros > 0) {
            pasajeros--;
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
}
