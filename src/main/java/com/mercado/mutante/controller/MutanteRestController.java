/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.controller;

import com.mercado.mutante.entities.CadenaAdn;
import com.mercado.mutante.entities.EstadisticasAdn;
import com.mercado.mutante.services.MutanteService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Saul Santillan
 */
@RestController
@RequestMapping("/mercado-libre/")
public class MutanteRestController {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    MutanteService mutanteService;

    @PostMapping(value="mutant",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> validarCadenaADN(@RequestBody CadenaAdn adn) {
           String[] secuencia = adn.getDna().toArray(new String[0]);
        if (mutanteService.validacionesIniciales(secuencia)) {
            if (mutanteService.isMutant(secuencia)) {
                return ResponseEntity.ok("Es un Mutante!!");
            }
        }
        return new ResponseEntity<String>("The String ResponseBody with custom status code (403 Forbidden)",
                HttpStatus.FORBIDDEN);
    }

    @GetMapping("saludo")
    public ResponseEntity<?> saludo() {
        return ResponseEntity.ok("Un Saludo Para Magneto!!!");
    }

    @PostMapping(value = "stats", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EstadisticasAdn> obtenerDatos() {
        return ResponseEntity.ok(mutanteService.obtenerEstadistica());
    }
}
