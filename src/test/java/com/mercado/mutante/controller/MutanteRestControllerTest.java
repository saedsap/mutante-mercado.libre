/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.controller;

import com.mercado.mutante.entities.CadenaAdn;
import com.mercado.mutante.entities.EstadisticasAdn;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Saul Santillan
 */
public class MutanteRestControllerTest {
    
    public MutanteRestControllerTest() {
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
     * Test of validarCadenaADN method, of class MutanteRestController.
     */
    @Test
    public void testValidarCadenaADN() {
        System.out.println("validarCadenaADN");
        CadenaAdn adn = null;
        MutanteRestController instance = new MutanteRestController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.validarCadenaADN(adn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Saludo method, of class MutanteRestController.
     */
    @Test
    public void testSaludo() {
        System.out.println("Saludos");
        MutanteRestController instance = new MutanteRestController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.saludo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDatos method, of class MutanteRestController.
     */
    @Test
    public void testObtenerDatos() {
        System.out.println("obtenerDatos");
        MutanteRestController instance = new MutanteRestController();
        ResponseEntity<EstadisticasAdn> expResult = null;
        ResponseEntity<EstadisticasAdn> result = instance.obtenerDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
