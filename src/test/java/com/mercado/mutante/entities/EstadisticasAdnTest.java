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
public class EstadisticasAdnTest {
    
    public EstadisticasAdnTest() {
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
     * Test of getCount_mutant_dna method, of class EstadisticasAdn.
     */
    @Test
    public void testGetCount_mutant_dna() {
        System.out.println("getCount_mutant_dna");
        EstadisticasAdn instance = new EstadisticasAdn(0,0,0);
        long expResult = 0L;
        long result = instance.getCount_mutant_dna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCount_mutant_dna method, of class EstadisticasAdn.
     */
    @Test
    public void testSetCount_mutant_dna() {
        System.out.println("setCount_mutant_dna");
        long count_mutant_dna = 0L;
        EstadisticasAdn instance = new EstadisticasAdn(0, 0, 0);
        instance.setCount_mutant_dna(count_mutant_dna);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCount_human_dna method, of class EstadisticasAdn.
     */
    @Test
    public void testGetCount_human_dna() {
        System.out.println("getCount_human_dna");
        EstadisticasAdn instance = new EstadisticasAdn(0, 0, 0);
        long expResult = 0L;
        long result = instance.getCount_human_dna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCount_human_dna method, of class EstadisticasAdn.
     */
    @Test
    public void testSetCount_human_dna() {
        System.out.println("setCount_human_dna");
        long count_human_dna = 0L;
        EstadisticasAdn instance = new EstadisticasAdn(0, 0, 0);
        instance.setCount_human_dna(count_human_dna);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRatio method, of class EstadisticasAdn.
     */
    @Test
    public void testGetRatio() {
        System.out.println("getRatio");
        EstadisticasAdn instance = new EstadisticasAdn(0, 0, 0);
        float expResult = 0.0F;
        float result = instance.getRatio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRatio method, of class EstadisticasAdn.
     */
    @Test
    public void testSetRatio() {
        System.out.println("setRatio");
        float ratio = 0.0F;
        EstadisticasAdn instance = new EstadisticasAdn(0, 0, 0);
        instance.setRatio(ratio);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
