/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.mutante.services;
import com.mercado.mutante.entities.EstadisticaMutante;
import com.mercado.mutante.entities.EstadisticasAdn;
import com.mercado.mutante.repository.CadenaADNRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Saul Santillan
 */
@Service
public class MutanteService {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    private final List<String> CADENA_NITROGENADA = new ArrayList<String>(Arrays.asList("AAAA", "TTTT", "GGGG", "CCCC"));
    private char[][] cuadrante;

    @Autowired
    CadenaADNRepository aDNRepository;

    public Boolean validacionesIniciales( String[] secuencia) {
        try {
            this.cuadrante = new char[secuencia.length][secuencia.length];
            secuencia = this.generaMayus(secuencia);
            for (int i = 0; i < secuencia.length; i++) {
                logger.info("Secuencia:" + secuencia[i]);
                if (!secuencia[i].matches("[ATCG]*") ||secuencia[i].length() != secuencia.length) {
                    logger.error("Secuencia de ADN con errores");
                    return false;
                }
                this.cuadrante[i] = secuencia[i].toCharArray();
            }
            return Boolean.TRUE;
        } catch (Exception ex) {
            ex.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean isMutant(String[] secuencia) {
        try {
            boolean resultado = this.validaMutante(secuencia);
            if (resultado) {
                EstadisticaMutante data = new EstadisticaMutante();
                data.setIsMutante(1);
                aDNRepository.save(data);
            } else {
                EstadisticaMutante data = new EstadisticaMutante();
                data.setIsMutante(0);
                aDNRepository.save(data);
            }
            return resultado;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean validaMutante(String[] secuencia) {
        try {
            int numCadeMutantes = 0;
            /**
             * for (int x = 0; x < cuadrante.length; x++) { for (int y = 0; y <
             * cuadrante.length; y++) { logger.info("pos=[" + x + "][" + y +
             * "]=" + cuadrante[x][y]); } }*
             */
                for (int x = 0; x < cuadrante.length; x++) {
                    if (numCadeMutantes < 2) {
                        for (int y = 0; y < cuadrante.length; y++) {
                            char puntero = cuadrante[x][y];
                            if (numCadeMutantes < 2) {
                               if ((x + 4) <= cuadrante.length) {
                                    if (cadenaVertical(puntero,x, y)) {
                                        numCadeMutantes++;                                    }
                                }
                            } else {
                                return true;
                            }
                            if (numCadeMutantes < 2) {
                                 if ((y + 4) <= cuadrante.length) {
                                    if (cadenaHorizontal(puntero,x, y)) {
                                        numCadeMutantes++;
                                    }
                                }
                            } else {
                                return true;
                            }
                            if (numCadeMutantes < 2) {
                                if ((y + 4) <= cuadrante.length) {
                                    if ((x + 4) <= cuadrante.length) {
                                        if (cadenaDiagonal(puntero,x, y)) {
                                            numCadeMutantes++; 
                                        }
                                    }
                                }
                            } else {
                                return true;
                            }
                            if (numCadeMutantes < 2) {
                                if (y >= 3) {
                                    if ((x + 4) <= cuadrante.length) {
                                        if (cadenaInversa(puntero,x, y)) {
                                            numCadeMutantes++;
                                        }
                                    }
                                }
                            } else {
                                return true;
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
        } catch (Exception ex) {
            logger.error(ex.getCause());
            return false;
        }
    }

    public EstadisticasAdn obtenerEstadistica() {
        long numMutantes = aDNRepository.countByIsMutante(1);
        logger.info("Resultado del count Mutantes " + numMutantes);
        float ratio = 0;
        long total = 0;
        total = aDNRepository.count();
        long numHumanos = total - numMutantes;
        if (total > 0) {
            ratio = ((float) numMutantes / (float) numHumanos);
        }
        EstadisticasAdn estadisticasAdn = new EstadisticasAdn(numMutantes, numHumanos, ratio);
        return estadisticasAdn;
    }

    private String[] generaMayus(String[] secuencia) {
        for (int i = 0; i < secuencia.length; i++) {
            secuencia[i] = secuencia[i].toUpperCase();
        }
        return secuencia;
    }

    private boolean cadenaHorizontal(char cuadranteActual,int fila, int columna) {
        String cadena = "";
        cadena = "" + cuadranteActual + cuadrante[fila][columna + 1] + cuadrante[fila][columna + 2]
                + cuadrante[fila][columna + 3];

        return this.validaBaseNitrogenada(cadena);
    }

    private boolean cadenaVertical(char cuadranteActual,int fila, int columna) {
        String cadena = "";
        cadena = "" + cuadranteActual + cuadrante[fila + 1][columna] + cuadrante[fila + 2][columna]
                + cuadrante[fila + 3][columna];
        return this.validaBaseNitrogenada(cadena);
    }

    private boolean cadenaDiagonal(char cuadranteActual,int fila, int columna) {
        String cadena = "";
        cadena = "" + cuadranteActual + cuadrante[fila + 1][columna + 1] + cuadrante[fila + 2][columna + 2]
                + cuadrante[fila + 3][columna + 3];
        return this.validaBaseNitrogenada(cadena);
    }

    private boolean cadenaInversa(char cuadranteActual,int fila, int columna) {
        String cadena = "";
        cadena = "" + cuadranteActual + cuadrante[fila + 1][columna - 1] + cuadrante[fila + 2][columna - 2]
                + cuadrante[fila + 3][columna - 3];
        return this.validaBaseNitrogenada(cadena);
    }

    private boolean validaBaseNitrogenada(String secuencia) {
        if (CADENA_NITROGENADA.contains(secuencia)) {
            logger.info("Se encontro una secuncia" + secuencia);
            return true;
        } else {
            return false;
        }
    }

}
