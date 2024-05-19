package com.suma.Capitulo_7;

import javax.swing.JOptionPane;

public class MediaGeometrica {
    private int cantTerminos;
    Double[] ingresNum = new Double[50];
    Double  mediaGeometrica;
    Double producto;

    public int getCantTerminos() {
        return cantTerminos;
    }
    public void setCantTerminos() {
        this.cantTerminos = Integer.valueOf(JOptionPane.showInputDialog("Cuantos numeros ingresaras: "));
    }

    public MediaGeometrica() {
        producto = 1.0;
    }

    public Double hallarMediaGeometrica() {
        for (int i = 1; i <= getCantTerminos(); i++) {
            ingresNum[i] = Double.valueOf(JOptionPane.showInputDialog("Numero " + i + ": ", ingresNum[i]));
            producto = producto * ingresNum[i];
        }
        return producto;
    }

    public Double mostrarMediaGeometrica() {
        mediaGeometrica = Math.pow(producto, 1.0 / cantTerminos);
        JOptionPane.showMessageDialog(null, "La Media Geometrica es: " + mediaGeometrica, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        return 0.0;
    }
    
}
