/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios20.classes;

import java.time.LocalDate;
import com.google.common.base.Preconditions;

/**
 *
 * @author alumno
 */
public abstract class Transporte implements Comparable<Transporte>{
    private final String id;
    private final int anoCompra;
    private double monedero;
    private int capacidad;
    private int pasajeros;

    protected Transporte(String id, int anoCompra, int capacidad) {
        Preconditions.checkNotNull(id);
        Preconditions.checkArgument(!id.isBlank());
        checkYear(anoCompra);
        checkGreaterThanZero(capacidad);
        this.id = id;
        this.anoCompra = anoCompra;
        this.capacidad = capacidad;
        this.monedero = 0;
        this.pasajeros = 0;
    }    
    
    private static void checkYear(int n) {
        if (LocalDate.now().getYear() - n < 0) {
            throw new IllegalArgumentException("el año de compra no puede ser posterior al actual.");
        }
    }    
    private static void checkGreaterThanZero(Number n) {
        Preconditions.checkArgument(n.doubleValue() > 0);
    }    

    public String getId() {
        return id;
    }

    public double getMonedero() {
        return monedero;
    }
    
    
    public boolean subirPasajero(){
        if (pasajeros < capacidad) {
            pasajeros++;
            monedero += getPrecioClase();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean bajarPasajero(){
        if (pasajeros > 0) {
            pasajeros--;
            return true;
        }else{
            return false;
        }
    }
    
    public double getPrecioClase(){        
        if (this instanceof Autobus) {
            return Autobus.getPrecio();
        }else if (this instanceof Metro) {
            return Metro.getPrecio();
        }else{
            throw new IllegalArgumentException("Error.");
        }
 
    }

    @Override
    public String toString() {
        return String.format("ID: %s \nAño compra: %d\nMonedero: %,.2f\nCapacidad: %d\nPasajeros: %d", id, anoCompra, monedero, capacidad, pasajeros);
    }

    @Override
    public int compareTo(Transporte o) {
        return this.id.compareTo(o.id);
    }
    
    
    
    
    
    
}
