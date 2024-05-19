package com.suma.Capitulo_4;

public class CocienteResiduo {
    private int dividendo;
    private int divisor;
    
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int hallarCocineteResiduo() {
        int cosciente = 0, residuo;
        while (dividendo > divisor) {
            dividendo = dividendo - divisor;
            cosciente = cosciente + 1;
        }
        residuo = dividendo;
        System.out.println("El cosciente es: " + cosciente);
        System.out.println("El residuo es: " + residuo);
        return 0;
    }
    
}
