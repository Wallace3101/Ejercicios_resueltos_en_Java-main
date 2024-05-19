package com.suma.Capitulo_2;

public class OrdenarTresNumeros {
    private Double num1;
    private Double num2;
    private Double num3;
    
    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum3() {
        return num3;
    }

    public void setNum3(Double num3) {
        this.num3 = num3;
    }

    public Double ordenarTresNumeros() {
        System.out.println("Los numeros ingresados son: " + getNum1() + " | " + getNum2() + " | " + getNum3());
        System.out.println("El orden de los numeros de forma descendente es: ");
        if (getNum1() >= getNum2() && getNum2()>= getNum3()) 
            System.out.println(" | "+ getNum1() + " | " + getNum2() + " | " + getNum3() + " | ");
         else if (getNum1() >= getNum3() && getNum3()>= getNum2()) 
            System.out.println(" | "+ getNum1() + " | " + getNum3() + " | " + getNum2() + " | ");
         else if (getNum2() >= getNum1() && getNum1()>= getNum3()) 
            System.out.println(" | "+ getNum2() + " | " + getNum1() + " | " + getNum3() + " | ");
         else if (getNum2() >= getNum3() && getNum3()>= getNum1()) 
            System.out.println(" | "+ getNum2() + " | " + getNum3() + " | " + getNum1() + " | ");
         else if (getNum3() >= getNum1() && getNum1()>= getNum2()) 
            System.out.println(" | "+ getNum3() + " | " + getNum1() + " | " + getNum2() + " | ");
         else 
            System.out.println(" | "+ getNum3() + " | " + getNum2() + " | " + getNum1() + " | ");
        return 0.0;
    }
    
}
