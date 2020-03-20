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
public class Principal {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Carrera de relevos");
        Corredor c1 = new Corredor("Corredor 1 E1");
        Corredor c2 = new Corredor("Corredor 2 E1");
        Corredor c3 = new Corredor("Corredor 3 E1");
        Corredor c4 = new Corredor("Corredor 1 E2");
        Corredor c5 = new Corredor("Corredor 2 E2");
        Corredor c6 = new Corredor("Corredor 3 E2");
        Corredor c7 = new Corredor("Corredor 1 E3");
        Corredor c8 = new Corredor("Corredor 2 E3");
        Corredor c9 = new Corredor("Corredor 3 E3");
        
        Equipo e1 = new Equipo(c1, c2, c3);
        Equipo e2 = new Equipo(c4, c5, c6);
        Equipo e3 = new Equipo(c7, c8, c9);
        
        Pista pista = new Pista(e1, e2, e3);
        Imprimir imprimir = new Imprimir(pista);
        
        imprimir.start();
        pista.start();


    }
}
