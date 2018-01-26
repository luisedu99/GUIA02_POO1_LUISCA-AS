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
public class Ejer1 {
     List<Moneda> listMone;

    public Ejer1() {
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
}
