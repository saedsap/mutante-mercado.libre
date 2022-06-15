package com.mercado.mutante;

import com.mercado.mutante.entities.EstadisticasAdn;
import com.mercado.mutante.repository.CadenaADNRepository;
import com.mercado.mutante.services.MutanteService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class MutanteApplicationTests {

    @Autowired
    MutanteService mutanteService;

    @Test
    void contextLoads() {
        System.out.println("ObtenerEstadistica");
        EstadisticasAdn adn = mutanteService.obtenerEstadistica();
        System.out.println("Ratio: " + adn.getRatio());
        System.out.println("Mutantes: " + adn.getCount_mutant_dna());
        System.out.println("Humanos: " + adn.getCount_human_dna());
        Assert.assertNotNull(adn);

    }

    @Test
    void validaFlujocompleto() {
        System.out.println("Obtener Flujo Completo 200");
        List<String> lista = new ArrayList();
        lista.add("ATGCGT");
        lista.add("CAGTTC");
        lista.add("TTATGT");
        lista.add("AGTAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);
        Boolean resultado = false;
        if (mutanteService.validacionesIniciales(secuencia)) {
             resultado = mutanteService.isMutant(secuencia);
        }

        assertEquals(Boolean.TRUE, resultado);
    }
    
    @Test
    void validaFlujo403() {
        System.out.println("Obtener Flujo Completo 403");
        List<String> lista = new ArrayList();
        lista.add("ATGCGA");
        lista.add("CAGTTC");
        lista.add("TTGTGT");
        lista.add("AGAAGG");
        lista.add("TCACTG");
        lista.add("TCACTG");
        String[] secuencia = lista.toArray(new String[0]);
        Boolean resultado = false;
        if (mutanteService.validacionesIniciales(secuencia)) {
             resultado = mutanteService.isMutant(secuencia);
        }

        assertEquals(Boolean.FALSE, resultado);
    }

}
