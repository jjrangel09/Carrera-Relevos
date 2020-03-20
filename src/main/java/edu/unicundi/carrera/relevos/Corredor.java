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
public class Corredor extends Thread {

    private final String nombre;
    private static int posicion = 0;
    private int pasos = 0, pausa = 0;
    boolean detener = false;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            correr();
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void correr() throws InterruptedException {
        while (!detener) {
            //System.out.println("Inicio corredor: " + nombre);
            while (pasos < 33) {
                pausa += (int) Math.floor(Math.random() * 3);
                pasos += pausa;
                if (pasos > 33) {
                    pasos = 33;
                }
                Thread.sleep(pausa * 100);
                //System.out.println(pasos + " " + getName());
            }
            detener();
        }
        posicion++;
        System.out.println(nombre + " Posicion:" + (posicion-6));
    }

    public boolean detener() {
        detener = true;
        return detener;
    }

    public String getNombre() {
        return nombre;
    }


    public int getPosicion() {
        return posicion;
    }

    public int getPasos() {
        return pasos;
    }
}
