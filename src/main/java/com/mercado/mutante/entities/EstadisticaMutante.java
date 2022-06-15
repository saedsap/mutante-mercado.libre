/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Saul Santillan
 */
@Entity
@Table(name = "estadistica_mutante")
public class EstadisticaMutante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "is_mutante")
    private int isMutante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIsMutante() {
        return isMutante;
    }

    public void setIsMutante(int isMutante) {
        this.isMutante = isMutante;
    }
    
    
}
