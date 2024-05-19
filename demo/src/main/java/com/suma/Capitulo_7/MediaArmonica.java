package com.suma.Capitulo_7;
import javax.swing.JOptionPane;

public class MediaArmonica {
    private int cantDatos;
    Double[] misNumeros = new Double[50];
    Double suma = 0.0;
    Double mediaArmonica;

    public int getCantDatos() {
        return cantDatos;
    }
    public void setCantDatos() {
        this.cantDatos = Integer.valueOf(JOptionPane.showInputDialog("Cuantos datos ingresara?: "));
    }
    

    public Double calcularMediaArmonica() {
        for (int i = 1; i <= getCantDatos(); i++) {
            misNumeros[i] = Double.valueOf(JOptionPane.showInputDialog("Numero " + i + ": ", misNumeros[i]));
            suma = suma + misNumeros[i];
        }
        return suma;
    }

    public void mostrarMediaArmonica() {
        mediaArmonica =  getCantDatos() / suma;
        JOptionPane.showMessageDialog(null,"La media armonica es : " +  mediaArmonica, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
