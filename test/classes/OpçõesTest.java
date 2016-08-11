/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wedson
 */
public class OpçõesTest {
    
    public OpçõesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of luzacessa method, of class Opções.
     */
    @Test
    public void testLuzacessa() {
        System.out.println("luzacessa");
        int num = 0;
        Opções instance = new Opções();
        boolean expResult = false;
        boolean result = instance.luzacessa(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of numtrue method, of class Opções.
     */
    @Test
    public void testNumtrue() {
        System.out.println("numtrue");
        int num = 1;
        Opções instance = new Opções();
        boolean expResult = true;
        boolean result = instance.numtrue(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of disponivel method, of class Opções.
     */
    @Test
    public void testDisponivel() {
        System.out.println("disponivel");
        int num = 0;
        Opções instance = new Opções();
        boolean expResult = false;
        boolean result = instance.disponivel(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
