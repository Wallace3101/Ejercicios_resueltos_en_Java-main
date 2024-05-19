package com.suma.Capitulo_7;
import javax.swing.JOptionPane;

public class MediaAritmetica {
    private Double suma = 0.0;
    private int cantDatos;
    private Double[] misDatos = new Double[50];

    public int getCantDatos() {
        return cantDatos;
    }
    public void setCantDatos() {
        this.cantDatos  = Integer.valueOf(JOptionPane.showInputDialog("Cuantos datos ingresaras?: "));
    }  
    
    public Double calcularMediaAritmetica() {
        for (int i = 1; i <= getCantDatos(); i++) {
            misDatos[i] = Double.valueOf(JOptionPane.showInputDialog("Numero " + i + ": ", misDatos[i]));
            suma = suma + misDatos[i];
        }
        return suma;
    }

    public Double mostrarMediaAritmetica() {
        Double media;
        media = suma / getCantDatos();
        JOptionPane.showMessageDialog(null,"La media es: " +  media, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        return 0.0;
    }
    
}
