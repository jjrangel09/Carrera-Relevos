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
public class Equipo extends Thread {

    Corredor c1, c2, c3;

    public Equipo(Corredor c1, Corredor c2, Corredor c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    
    @Override
    public void run(){
        iniciar();
    }
    
    public synchronized void iniciar(){
        try {
            c1.correr();
            c2.correr();
            c3.correr();
        } catch (InterruptedException ex) {
            Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
