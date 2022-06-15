/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.entities;

/**
 *
 * @author Saul Santillan
 */
public class EstadisticasAdn {

    private long count_mutant_dna;
    private long count_human_dna;
    private float ratio;

    public EstadisticasAdn(long numMut, long numHum, float ratio) {
        this.count_human_dna=numHum;
        this.count_mutant_dna=numMut;
        this.ratio=ratio;
    }

    
    public long getCount_mutant_dna() {
        return count_mutant_dna;
    }

    public void setCount_mutant_dna(long count_mutant_dna) {
        this.count_mutant_dna = count_mutant_dna;
    }

    public long getCount_human_dna() {
        return count_human_dna;
    }

    public void setCount_human_dna(long count_human_dna) {
        this.count_human_dna = count_human_dna;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }


   
}
