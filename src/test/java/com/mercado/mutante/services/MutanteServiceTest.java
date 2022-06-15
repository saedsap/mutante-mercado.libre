/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.services;

import com.mercado.mutante.entities.EstadisticasAdn;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saul Santillan
 */
public class MutanteServiceTest {

    public MutanteServiceTest() {
    }

    /**
     * Test of validacionesIniciales method, of class MutanteService.
     */
    @Test
    public void testValidacionesInicialesOk() {
        System.out.println("validacionesIniciales OK");
        List<String> lista = new ArrayList();
        lista.add("ATGCGT");
        lista.add("CAGTTC");
        lista.add("TTATGT");
        lista.add("AGTAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);
        MutanteService instance = new MutanteService();
        Boolean expResult = true;
        Boolean result = instance.validacionesIniciales(secuencia);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidacionesInicialesFail() {
        System.out.println("validacionesIniciales Fail");
        List<String> lista = new ArrayList();
        lista.add("ATGCG");
        lista.add("CAGTTC");
        lista.add("TTATGT");
        lista.add("AGTAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);
        MutanteService instance = new MutanteService();
        Boolean expResult = false;
        Boolean result = instance.validacionesIniciales(secuencia);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidacionesInicialesLogitud() {
        System.out.println("Secuencia longitud diferente");
        List<String> lista = new ArrayList();
        lista.add("ATGCGC");
        lista.add("CAGTTC");
        lista.add("TTATGT");
        lista.add("AGTA");
        lista.add("TCACTG");
        lista.add("TCACTG");
        MutanteService instance = new MutanteService();
        Boolean expResult = false;
        String[] secuencia2 = lista.toArray(new String[0]);
        Boolean result2 = instance.validacionesIniciales(secuencia2);
        assertEquals(expResult, result2);
    }

    @Test
    public void testValidacionesInicialesCaracterDif() {
        System.out.println("Secuencia longitud diferente");
        List<String> lista = new ArrayList();
        lista.add("ATGCGC");
        lista.add("CA1TTC");
        lista.add("TTATGT");
        lista.add("AGTAGT");
        lista.add("TCHCTG");
        lista.add("TCACTG");
        MutanteService instance = new MutanteService();
        Boolean expResult = false;
        String[] secuencia2 = lista.toArray(new String[0]);
        Boolean result2 = instance.validacionesIniciales(secuencia2);
        assertEquals(expResult, result2);
    }

    /*
     * Test of isMutant method, of class MutanteService.
     */
    @Test
    public void testIsMutant_CadenaAdn() {
        System.out.println("isMutant");
        List<String> lista = new ArrayList();
        lista.add("ATGCGT");
        lista.add("CAGTTC");
        lista.add("TTATGT");
        lista.add("AGTAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);

        MutanteService instance = new MutanteService();

        Boolean expResult = true;
        System.out.println("Validacion inicial" + instance.validacionesIniciales(secuencia));
        Boolean result = instance.validaMutante(secuencia);
        System.out.println("Resultado:" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of IsMutant method, of class MutanteService.
     */
    @Test
    public void testIsMutant_StringArr() {
        System.out.println("isMutant");
        List<String> lista = new ArrayList();
        lista.add("ATGCGT");
        lista.add("cagtTc");
        lista.add("TTATGT");
        lista.add("AGTAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);

        MutanteService instance = new MutanteService();

        Boolean expResult = true;
        System.out.println("Validacion inicial" + instance.validacionesIniciales(secuencia));
        Boolean result = instance.validaMutante(secuencia);
        System.out.println("Resultado:" + result);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerEstadistica method, of class MutanteService.
     */
    @Test
    public void testIsMutant_4() {
        System.out.println("isMutant");
        List<String> lista = new ArrayList();
        lista.add("ATGCGT");
        lista.add("cagtTc");
        lista.add("TTGTGT");
        lista.add("TGGAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);

        MutanteService instance = new MutanteService();

        Boolean expResult = true;
        System.out.println("Validacion inicial" + instance.validacionesIniciales(secuencia));
        Boolean result = instance.validaMutante(secuencia);
        System.out.println("Resultado:" + result);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testIsMutant_5() {
        System.out.println("isMutant");
        List<String> lista = new ArrayList();
        lista.add("AAAAGTCAG");
        lista.add("CAGTGCTGC");
        lista.add("TTGTATTAT");
        lista.add("AGAAGGAGG");
        lista.add("CCCGCTACT");
        lista.add("TCACTGCTG");
        lista.add("TCACTGCTG");
        lista.add("AGAAGGGGG");
        lista.add("CAGTGCTGC");
        String[] secuencia = lista.toArray(new String[0]);

        MutanteService instance = new MutanteService();

        Boolean expResult = true;
        System.out.println("Validacion inicial" + instance.validacionesIniciales(secuencia));
        Boolean result = instance.validaMutante(secuencia);
        System.out.println("Resultado:" + result);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
    }

}
