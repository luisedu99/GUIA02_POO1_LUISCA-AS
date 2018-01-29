/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import javax.swing.JOptionPane;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sv.udb.forms.Pin;

/**
 *
 * @author luisedu
 */
public class Ejer3 {

    private static int contador = 0;
    public Ejer3() {
    }

    public String pin(String dato) {
        
        Pin form = new Pin();
        

        String numero = dato;
        String pin = "9089";
       // int contador = 0;

        try {
                if (numero.equals(pin)) {
                    JOptionPane.showMessageDialog(null, "El pin que ha ingresado es correcto");
                } else {
                    
                    if (contador == 3) {
                        System.out.print(contador);
                        JOptionPane.showMessageDialog(null, "Ha superado el limite de intentos", "Alerta", JOptionPane.WARNING_MESSAGE);
                    } else {
                        contador = contador +1;
                        System.out.print(contador);
                        JOptionPane.showMessageDialog(null, "El pin que ha ingresado es incorrecto", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            

        } catch (Exception ex) {
            System.err.println("Error : " + ex.getMessage());
        }

        return null;
    }

}
