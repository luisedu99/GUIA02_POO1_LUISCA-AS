/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisedu
 */
public class ejercicio1 {

    List<Moneda> listMone;

    public ejercicio1() {
        this.listMone = new ArrayList<>();
    }

    public void agregar(int cant, double deno) {
        this.listMone.add(new Moneda(cant, deno));
    }

    public double calcular() {
        double resp = 0;
        try {
            for (Moneda temp : this.listMone) {
                resp += (temp.getCant() * temp.getDeno());
            }
        } catch (Exception ex) {
            System.err.println("Error al calcular: " + ex.getMessage());
        }
        return resp;
    }

    public void contar(double canti) {
        double cant = canti;
        double dinero[] = new double[13];
        int i = 0;
        while (cant > 0) {
            while (cant - 500 >= 0) {
                cant = cant - 500;
                dinero[0]++;
            }
            while (cant - 200 >= 0) {
                cant = cant - 200;
                dinero[1]++;
            }
            while (cant - 100 >= 0) {
                cant = cant - 100;
                dinero[2]++;
            }
            while (cant - 50 >= 0) {
                cant = cant - 50;
                dinero[3]++;
            }
            while (cant - 20 >= 0) {
                cant = cant - 20;
                dinero[4]++;
            }
            while (cant - 10 >= 0) {
                cant = cant - 10;
                dinero[5]++;
            }
            while (cant - 5 >= 0) {
                cant = cant - 5;
                dinero[6]++;
            }
            while (cant - 2 >= 0) {
                cant = cant - 2;
                dinero[7]++;
            }
            while (cant - 1 >= 0) {
                cant = cant - 1;
                dinero[8]++;
            }
            while (cant - 0.25 >= 0) {
                cant = cant - 0.25;
                dinero[9]++;
            }
            while (cant - 0.10 >= 0) {
                cant = cant - 0.10;
                dinero[10]++;
            }
            while (cant - 0.05 >= 0) {
                cant = cant - 0.05;
                dinero[11]++;
            }
            while (cant - 0.01 >= 0) {
                cant = cant - 0.01;
                dinero[12]++;
            }
        }
        for (i = 0; i < 13; i++) {
            if (i == 0) {
                System.out.println(dinero[i] + " billetes de 500");
            }
            if (i == 1) {
                System.out.println(dinero[i] + " billetes de 200");
            }
            if (i == 2) {
                System.out.println(dinero[i] + " billetes de 100");
            }
            if (i == 3) {
                System.out.println(dinero[i] + " billetes de 50");
            }
            if (i == 4) {
                System.out.println(dinero[i] + " billetes de 20");
            }
            if (i == 5) {
                System.out.println(dinero[i] + " billetes de 10");
            }
            if (i == 6) {
                System.out.println(dinero[i] + " billetes de 5");
            }
            if (i == 7) {
                System.out.println(dinero[i] + " monedas de 2");
            }
            if (i == 8) {
                System.out.println(dinero[i] + " monedas de 1");
            }
            if (i == 9) {
                System.out.println(dinero[i] + " monedas de 0.25");
            }
            if (i == 10) {
                System.out.println(dinero[i] + " monedas de 0.10");
            }if (i == 11) {
                System.out.println(dinero[i] + " monedas de 0.05");
            }if (i == 12) {
                System.out.println(dinero[i] + " monedas de 0.01");
            }
        }
    }
}


