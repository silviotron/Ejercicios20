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
public class Autobus extends Transporte{
    
    private final String ruta;
    private static double precio = 0.95;

    public Autobus(String ruta, String id, int anoCompra, int capacidad) {
        super(id, anoCompra, capacidad);
        this.ruta = ruta;
    }
    public static void setPrecio(double precio){
        Autobus.precio = precio;
    }    

    public static double getPrecio() {
        return precio;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nRuta: " + this.ruta;
    }
    
    
    
    
    
}
