/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrera.relevos;

/**
 *
 * @author Juan José Rangel
 */
public class Pista extends Thread{

    private Equipo e1, e2, e3;

    public Pista(Equipo e1, Equipo e2, Equipo e3) throws InterruptedException {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public Equipo getE1() {
        return e1;
    }

    public Equipo getE2() {
        return e2;
    }

    public Equipo getE3() {
        return e3;
    }
    
    @Override
    public void run(){
        e1.start();
        e2.start();
        e3.start();
    }

}
