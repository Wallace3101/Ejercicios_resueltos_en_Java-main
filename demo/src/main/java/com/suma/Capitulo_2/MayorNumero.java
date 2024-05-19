package com.suma.Capitulo_2;

public class MayorNumero {
    private Double numero1;
    private Double numero2;
    private Double numero3;
    
    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getNumero3() {
        return numero3;
    }

    public void setNumero3(Double numero3) {
        this.numero3 = numero3;
    }

    public Double encontrarMayor() {
        Double numMayor;
        if (getNumero1() >= getNumero2()) {
            if (getNumero1() >= getNumero3()) {
                numMayor = getNumero1();
            } else 
                numMayor = getNumero3();
        } else if (getNumero2() >= getNumero3())  {
            numMayor = getNumero2();
          } else 
            numMayor = getNumero3();
        System.out.println("El numero mayor es: " + numMayor);
        return numMayor;
    }
}
