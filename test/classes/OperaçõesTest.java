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
public class OperaçõesTest {
    
    public OperaçõesTest() {
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
     * Test of multiplicação method, of class Operações.
     */
    @Test
    public void testMultiplicação() {
        System.out.println("multiplica\u00e7\u00e3o");
        double num1 = 5.0;
        double num2 = 5.0;
        Operações instance = new Operações();
        double expResult = 25.0;
        double result = instance.multiplicação(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divisão method, of class Operações.
     */
    @Test
    public void testDivisão() {
        System.out.println("divis\u00e3o");
        double num1 = 25.0;
        double num2 = 5.0;
        Operações instance = new Operações();
        double expResult = 5.0;
        double result = instance.divisão(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of subtração method, of class Operações.
     */
    @Test
    public void testSubtração() {
        System.out.println("subtra\u00e7\u00e3o");
        double num1 = 10.0;
        double num2 = 7.0;
        Operações instance = new Operações();
        double expResult = 3.0;
        double result = instance.subtração(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
