/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.entities;

import java.util.List;
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
public class CadenaAdnTest {
    
    public CadenaAdnTest() {
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
     * Test of getDna method, of class CadenaAdn.
     */
    @Test
    public void testGetDna() {
        System.out.println("getDna");
        CadenaAdn instance = new CadenaAdn();
        List<String> expResult = null;
        List<String> result = instance.getDna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDna method, of class CadenaAdn.
     */
    @Test
    public void testSetDna() {
        System.out.println("setDna");
        List<String> dna = null;
        CadenaAdn instance = new CadenaAdn();
        instance.setDna(dna);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
