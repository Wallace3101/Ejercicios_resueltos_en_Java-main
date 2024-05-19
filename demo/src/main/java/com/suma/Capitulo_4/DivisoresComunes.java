package com.suma.Capitulo_4;

public class DivisoresComunes {
    private int firstNum;
    private int secondNum;

    public int getFirstNum() {
        return firstNum;
    }
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int hallarDivisores() {
        int aux = 1;
        if (getFirstNum() == 0 || getSecondNum() == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            System.out.println("Los divisores que tienen en comun son: ");
            while (aux <= getFirstNum() && aux <= getSecondNum() ) {
                if (getFirstNum() % aux == 0 && getSecondNum() % aux == 0 ) 
                    System.out.print(aux + "  ");
                aux = aux + 1;
            }
        }
        return 0;
    }
    
}
