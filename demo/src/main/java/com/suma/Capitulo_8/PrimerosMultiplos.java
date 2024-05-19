package com.suma.Capitulo_8;

import javax.swing.JOptionPane;

public class PrimerosMultiplos {
    private int cantidadMult;
    private  int numero;
    
    public int getCantidadMult() {
        return cantidadMult;
    }
    public void setCantidadMult() {
        int cantidadMult = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad de multiplos que quieres que se muestre: "));
        this.cantidadMult = cantidadMult;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero() {
        int numero = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero a analizar: "));
        this.numero = numero;
    }

    public int calcularMultiplos() {
        JOptionPane.showMessageDialog(null, "Los primeros " + getCantidadMult() + " multiplos de " + getNumero() + " son: ");
        for (int i = 0; i < cantidadMult; i++) {
            JOptionPane.showMessageDialog(null, numero + " x " + (i + 1) + " = " + numero * (i + 1));
        }
        return 0;
    }

}


