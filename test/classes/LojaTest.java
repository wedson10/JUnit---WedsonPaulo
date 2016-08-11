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
public class LojaTest {
    
    public LojaTest() {
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
     * Test of soma method, of class Loja.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int num1 = 5;
        int num2 = 5;
        Loja instance = new Loja();
        int expResult = 10;
        int result = instance.soma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of juros method, of class Loja.
     */
    @Test
    public void testJuros() {
        System.out.println("juros");
        double valor = 10.0;
        Loja instance = new Loja();
        double expResult = 12.0;
        double result = instance.juros(valor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of desconto method, of class Loja.
     */
    @Test
    public void testDesconto() {
        System.out.println("desconto");
        double valor = 10.0;
        Loja instance = new Loja();
        double expResult = 8.0;
        double result = instance.desconto(valor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
