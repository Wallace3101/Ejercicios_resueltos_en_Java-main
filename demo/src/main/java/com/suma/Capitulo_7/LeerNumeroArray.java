package com.suma.Capitulo_7;
import javax.swing.JOptionPane;
    
public class LeerNumeroArray {
    private int cantDatos;
    private Double[] miArray;

    public LeerNumeroArray() {
        Double[] miArray = new Double[50];
        this.miArray = miArray;
    }
    public int getCantDatos() {
        return cantDatos;
    }
    public void setCantDatos() {
        this.cantDatos = Integer.valueOf(JOptionPane.showInputDialog("De cuantos numeros sera el Array?: "));
    }

    public Double insertarArray() {
        for (int i = 1; i <= getCantDatos(); i++) {
            miArray[i] = Double.valueOf(JOptionPane.showInputDialog("Numero: " + i + ":", miArray));
        }
        return 0.0;
    }

    public Double mostrarArray() {
        for (int i = 1; i <= getCantDatos(); i++) {
            JOptionPane.showMessageDialog(null, miArray[i], "Datos ingresados en el Array: ", JOptionPane.INFORMATION_MESSAGE);
            //System.out.println(miArray[i]);
        }
       
        return 0.0;
    }

}
