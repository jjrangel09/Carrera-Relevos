/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrera.relevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan José Rangel
 */
public class Imprimir extends Thread {

    //Reset
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores de letra
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[36m";

    Pista pista;
    int aux = 0;

    Imprimir(Pista pista) {
        this.pista = pista;
    }

    @Override
    public void run() {
        try {
            while (aux<990) {
                System.out.println("-----------------------------------------------------------------------------------------------------\n"
                        + ANSI_RED + trazo(pista.getE1().c1.getPasos()) + trazo(pista.getE1().c2.getPasos())+ trazo(pista.getE1().c3.getPasos()) + "\n" + ANSI_RESET
                        + "-----------------------------------------------------------------------------------------------------\n"
                        + "-----------------------------------------------------------------------------------------------------\n"
                        + ANSI_GREEN + trazo(pista.getE2().c1.getPasos()) + trazo(pista.getE2().c2.getPasos())+ trazo(pista.getE2().c3.getPasos()) + "\n" + ANSI_RESET
                        + "-----------------------------------------------------------------------------------------------------\n"
                        + "-----------------------------------------------------------------------------------------------------\n"
                        + ANSI_BLUE + trazo(pista.getE3().c1.getPasos()) + trazo(pista.getE3().c2.getPasos())+ trazo(pista.getE3().c3.getPasos()) + "\n" + ANSI_RESET
                        + "-----------------------------------------------------------------------------------------------------");
                Thread.sleep(10);
                aux++;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String trazo(int pasos) {
        String cadena = "";
        for (int i = 0; i < pasos; i++) {
            cadena += "-";
        }
        cadena+="X";
        for (int i = 0; i < 33-pasos; i++) {
            cadena += "-";
        }
        return cadena;
    }

}
