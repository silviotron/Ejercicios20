/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios20.classes;

import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author alumno
 */
public class AyuntamientoNGTest {
    
    private static Ayuntamiento a;
    
    private static List <Transporte> transportes;
    
    
    
    public AyuntamientoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }  

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        a = new Ayuntamiento("Ayuntamiento");

        transportes = new ArrayList <>();

        for(int i = 0; i < 10; i++){
            transportes.add(new Autobus("1","100"+i, 1996 + i, 40+i));
            transportes.add(new Autobus("2","200"+i, 1999 + i, 20+i));
            transportes.add(new Metro("rojo","150"+i, 1995 + i, 100+i,true));
            transportes.add(new Metro("azul","250"+i, 2005 + i, 150+i,true));
        }
        for (Transporte o : transportes) {
            a.add(o);
            
        }

        
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of add method, of class Ayuntamiento.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        boolean result = a.add(new Autobus("2","777", 2020, 50));
        boolean expResult = true;
        assertEquals(result, expResult);

    }

    /**
     * Test of remove method, of class Ayuntamiento.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String s = "1001";
        boolean expResult = true;
        boolean result = a.remove(s);
        assertEquals(result, expResult);

    }

    /**
     * Test of getRecaudacion method, of class Ayuntamiento.
     */
    @Test
    public void testGetRecaudacion() {
        System.out.println("Monedero");
        for (int i = 0; i < 10; i++) {
            transportes.get(5).subirPasajero();
            transportes.get(4).subirPasajero();
            transportes.get(6).subirPasajero();
        }
        double expResult = 9.5 + 9.5 + 13.5;
        double result = a.getRecaudacion();
        assertEquals(result, expResult);
    }

    /**
     * Test of monedero method, of class Ayuntamiento.
     */
    @Test
    public void testMonedero() {
        System.out.println("Monedero");
        for (int i = 0; i < 10; i++) {
            transportes.get(5).subirPasajero();
        }
        double expResult = 9.5;
        double result = transportes.get(5).getMonedero();
        assertEquals(result, expResult);

    }
    
}
