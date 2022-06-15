/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.repository;

import com.mercado.mutante.entities.EstadisticaMutante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Saul Santillan
 */
public interface CadenaADNRepository extends JpaRepository<EstadisticaMutante, Long> {
    List<EstadisticaMutante> findByIsMutante(int isMutante);
    long countByIsMutante(int isMutante);


}
