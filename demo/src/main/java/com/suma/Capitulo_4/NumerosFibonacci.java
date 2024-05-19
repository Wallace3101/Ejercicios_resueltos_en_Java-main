package com.suma.Capitulo_4;

public class NumerosFibonacci {
    private int limitemax;
    
    public int getLimitemax() {
        return limitemax;
    }
    public void setLimitemax(int limitemax) {
        this.limitemax = limitemax;
    }

    public int hallarSerie() {
        int number1 = 1, number2 = 1, number3;
        System.out.println("Los " + getLimitemax() + " primeros términos de la secuencia de Fibonacci: ");
        System.out.print(number1 + " ");
        System.out.print(number2 + " ");

        for (int i = 2; i < getLimitemax(); i++) {
            number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
        return 0;
    }
    
}