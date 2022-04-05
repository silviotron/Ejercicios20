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
    private Map<String, Autobus> autobuses;
    private Map<String, Metro> metros;

    public Ayuntamiento(String nombre) {
        this.nombre = nombre;
        this.autobuses = new HashMap<>();
        this.metros = new HashMap<>();
    }
    
    public boolean add(Autobus o){
        if(autobuses.containsKey(o.getId())){
            this.autobuses.put(o.getId(), o);
            return true;
        }else{
            return false;
        }
    }
    public boolean add(Metro o){
        if(autobuses.containsKey(o.getId())){
            this.metros.put(o.getId(), o);
            return true;
        }else{
            return false;
        }
    }

    
    
    
    
}
