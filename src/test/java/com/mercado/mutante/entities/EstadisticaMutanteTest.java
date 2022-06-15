/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saul Santillan
 */
public class EstadisticaMutanteTest {
    
    public EstadisticaMutanteTest() {
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
     * Test of getId method, of class EstadisticaMutante.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        EstadisticaMutante instance = new EstadisticaMutante();
        instance.setId(0);
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class EstadisticaMutante.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        EstadisticaMutante instance = new EstadisticaMutante();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIsMutante method, of class EstadisticaMutante.
     */
    @Test
    public void testGetIsMutante() {
        System.out.println("getIsMutante");
        EstadisticaMutante instance = new EstadisticaMutante();
        instance.setIsMutante(0);
        int expResult = 0;
        int result = instance.getIsMutante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setIsMutante method, of class EstadisticaMutante.
     */
    @Test
    public void testSetIsMutante() {
        System.out.println("setIsMutante");
        int isMutante = 0;
        EstadisticaMutante instance = new EstadisticaMutante();
        instance.setIsMutante(isMutante);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
