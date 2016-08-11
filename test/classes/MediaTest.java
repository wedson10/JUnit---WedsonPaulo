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
public class MediaTest {
    
    public MediaTest() {
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
     * Test of mediatresnumeros method, of class Media.
     */
    @Test
    public void testMediatresnumeros() {
        System.out.println("mediatresnumeros");
        double num1 = 5.0;
        double num2 = 10.0;
        double num3 = 6.0;
        Media instance = new Media();
        double expResult = 7.0;
        double result = instance.mediatresnumeros(num1, num2, num3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mediadoisnumeros method, of class Media.
     */
    @Test
    public void testMediadoisnumeros() {
        System.out.println("mediadoisnumeros");
        double num1 = 6.0;
        double num2 = 8.0;
        Media instance = new Media();
        double expResult = 7.0;
        double result = instance.mediadoisnumeros(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mediaponderada method, of class Media.
     */
    @Test
    public void testMediaponderada() {
        System.out.println("mediaponderada");
        double num1 = 8.0;
        double num2 = 9.0;
        Media instance = new Media();
        double expResult = 8.6;
        double result = instance.mediaponderada(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
