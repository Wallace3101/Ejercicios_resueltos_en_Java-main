package com.suma.Capitulo_8;
import javax.swing.JOptionPane;

public class DivisorComunDosNumeros {
    private int num1;
    private int num2;
    
    public int getNum1() {
        return num1;
    }
    public void setNum1() {
        int num1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2() {
        int num2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese le segundo numero: "));
        this.num2 = num2;
    }

    public int calcularDivComunes() {
        int divisores = 1;
        while (divisores <= getNum1() && divisores <= getNum2()) {
            if (getNum1() % divisores == 0 && getNum2() % divisores == 0) 
                JOptionPane.showMessageDialog(null, "Los divisores comunes de " + getNum1() + " y " + getNum2() + " es " + divisores, "Resultado ", JOptionPane.INFORMATION_MESSAGE);
            divisores++;
        }
        return divisores;
    }
}

