package com.suma.Capitulo_8;

import javax.swing.JOptionPane;

public class TeoremaCoceno {
    private Double ladoB;
    private Double ladoC;
    private Double alfa;
    
    public Double getLadoB() {
        return ladoB;
    }
    public void setLadoB() {
        Double ladoB = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor del lado B: "));
        this.ladoB = ladoB;
    }
    public Double getLadoC() {
        return ladoC;
    }
    public void setLadoC() {
        Double ladoC = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor del lado C: "));
        this.ladoC = ladoC;
    }
    public Double getAlfa() {
        return alfa;
    }
    public void setAlfa() {
        Double alfa = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor del alfa: "));
        this.alfa = alfa;
    }

    public Double hallarLado() {
        Double ladoA;
        ladoA = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - 2 * ladoB * ladoC * Math.cos(alfa));
        JOptionPane.showMessageDialog(null, "El lado 'A' es: " + ladoA, "Caso Lado, Angulo, Lado (LAL):", JOptionPane.INFORMATION_MESSAGE);
        return 0.0;

    }

}
