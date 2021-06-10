/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

import fecha.Fecha;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josic
 */
public class FechaIT {
    
    
    
    
    public FechaIT() {
    }
   
    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha() {
      
        Fecha fecha = new Fecha();
        String resul = "2021/06";
        String result = fecha.devuelveFecha(1);
        assertEquals(resul, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
 @Test
 public void testDevuelveFecha1() {
     
        Fecha fecha = new Fecha();
        String resul = "06/2021";
        String result = fecha.devuelveFecha(2);
        assertEquals(resul, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
  @Test
  public void testDevuelveFecha2() {
        System.out.println("devuelveFecha");
        Fecha fecha = new Fecha();
        String resul = "06/21";
        String result = fecha.devuelveFecha(3);
        assertEquals(resul, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
   @Test
   public void testDevuelveFecha3() {
    
        Fecha fecha = new Fecha();
        String resul = "ERROR";
        String result = fecha.devuelveFecha(4);
        assertEquals(resul, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
