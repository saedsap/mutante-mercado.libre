/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.repository;

import com.mercado.mutante.entities.EstadisticaMutante;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Saul Santillan
 */
@SpringBootTest
public class CadenaADNRepositoryTest {
    @Autowired
    CadenaADNRepository aDNRepository;
    public CadenaADNRepositoryTest() {
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
     * Test of findByIsMutante method, of class CadenaADNRepository.
     */
    @Test
    public void testFindByIsMutante() {
        System.out.println("findByIsMutante");
        int isMutante = 0;
        List<EstadisticaMutante> expResult = null;
        List<EstadisticaMutante> result = aDNRepository.findByIsMutante(isMutante);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of countByIsMutante method, of class CadenaADNRepository.
     */
    @Test
    public void testCountByIsMutante() {
        System.out.println("countByIsMutante");
        int isMutante = 0;
        long expResult = 0L;
        long result = aDNRepository.countByIsMutante(isMutante);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

   
}
