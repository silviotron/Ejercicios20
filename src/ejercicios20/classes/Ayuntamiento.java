/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios20.classes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Ayuntamiento {
    
    private final String nombre;
    private Map<String, Transporte> transportes;

    public Ayuntamiento(String nombre) {
        this.nombre = nombre;
        this.transportes = new HashMap<>();
    }
    
    public boolean add(Transporte o){
        if(!transportes.containsKey(o.getId())){
            this.transportes.put(o.getId(), o);
            return true;
        }else{
            return false;
        }            

    }      

    public boolean remove(String s){
        if(transportes.containsKey(s)){
            this.transportes.remove(s);
            return true;
        }else{
            return false;
        }            

    }
    
    public static void setPrecioAutobus(double precio){
        Autobus.setPrecio(precio);
    }
    public static void setPrecioMetro(double precio){
        Metro.setPrecio(precio);
    }

    public double getRecaudacion(){
        double total = 0;
        for (String key : transportes.keySet()) {
            total+= transportes.get(key).getMonedero();
        }
        return total;
    }

    @Override
    public String toString() {
        return nombre + " - " + transportes;
    }


    
    
    
    
}
