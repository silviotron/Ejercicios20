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
public class Metro extends Transporte{

    private final String linea;
    private static double precio = 1.5;
    private boolean abreFindeNoche;
    

    public Metro(String linea, String id, int anoCompra, int capacidad, boolean abreFindeNoche) {
        super(id, anoCompra, capacidad);
        this.linea = linea;
        this.abreFindeNoche = abreFindeNoche;
    }
    
    public static void setPrecio(double precio){
        Metro.precio = precio;
    }      

    public static double getPrecio() {
        return precio;
    }
    
    
    
    
    @Override
    public String toString() {
        return super.toString() + "\nLinea: " + this.linea;
    }    

}
