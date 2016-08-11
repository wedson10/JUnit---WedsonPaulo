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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
     * Test of nome method, of class Funcionario.
     */
    @Test
    public void testNome() {
        System.out.println("nome");
        String nome = "joao";
        Funcionario instance = new Funcionario();
        String expResult = "joao";
        String result = instance.nome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of idade method, of class Funcionario.
     */
    @Test
    public void testIdade() {
        System.out.println("idade");
        String idade = "17";
        Funcionario instance = new Funcionario();
        String expResult = "17";
        String result = instance.idade(idade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of profissao method, of class Funcionario.
     */
    @Test
    public void testProfissao() {
        System.out.println("profissao");
        String profissao = "motorista";
        Funcionario instance = new Funcionario();
        String expResult = "motorista";
        String result = instance.profissao(profissao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
