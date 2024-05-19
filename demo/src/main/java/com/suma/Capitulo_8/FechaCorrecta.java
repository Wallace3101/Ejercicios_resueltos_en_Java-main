package com.suma.Capitulo_8;

import javax.swing.JOptionPane;

public class FechaCorrecta {
    private int dia;
    private int mes;
    private int anio;
    
    public int getDia() {
        return dia;
    }
    public void setDia() {
        int dia = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el dia: "));
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes() {
        int mes = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el mes: "));
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio() {
        int anio = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el año: "));
        this.anio = anio;
    }

    public int verificarFecha() {
        int maxdia;
        switch(getMes()) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxdia = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxdia = 30;
                break;
            case 2:
                if ((getAnio() % 4 == 0 && getAnio() % 100 != 0) || getAnio() % 400 == 0)
                    maxdia = 29;
                else
                    maxdia = 28;
                break;
            default:
                maxdia = 0;
        }
        if ((getDia()>0) && (getDia()<=maxdia) && (getMes()>0) && (getMes()<13) && (getAnio()>0))
            JOptionPane.showMessageDialog(null, "La fecha es correcta.");
        else
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta.");
        return 0;
    }
}
