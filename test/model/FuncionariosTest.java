/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dirceu
 */
public class FuncionariosTest {
    
    public FuncionariosTest() {
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
     * Test of getId method, of class Funcionarios.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Funcionarios instance = new Funcionarios();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class Funcionarios.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Funcionarios instance = new Funcionarios();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNome method, of class Funcionarios.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionarios instance = new Funcionarios();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNome method, of class Funcionarios.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = null;
        Funcionarios instance = new Funcionarios();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEndereco method, of class Funcionarios.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Funcionarios instance = new Funcionarios();
        String expResult = null;
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEndereco method, of class Funcionarios.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = null;
        Funcionarios instance = new Funcionarios();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmpresa method, of class Funcionarios.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        Funcionarios instance = new Funcionarios();
        String expResult = null;
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmpresa method, of class Funcionarios.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = null;
        Funcionarios instance = new Funcionarios();
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
