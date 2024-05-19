package com.suma.Capitulo_2;

public class RaicesEcuacionSegundoGrado {
    private Double coefA;
    private Double coefB;
    private Double termIndependiente;
    
    public Double getCoefA() {
        return coefA;
    }

    public void setCoefA(Double coefA) {
        this.coefA = coefA;
    }

    public Double getCoefB() {
        return coefB;
    }

    public void setCoefB(Double coefB) {
        this.coefB = coefB;
    }

    public Double getTermIndependiente() {
        return termIndependiente;
    }

    public void setTermIndependiente(Double termIndependiente) {
        this.termIndependiente = termIndependiente;
    }

    public Double discriminante() {
        Double discriminante = Math.pow(getCoefB(), 2) - 4 * getCoefA() * getTermIndependiente();
        return discriminante;
    }
    public Double hallarRaices() {
        Double raiz1, raiz2, raiz;
        if (discriminante() > 0) {
            raiz1 = (-getCoefB() + Math.sqrt(discriminante())) / (2 * getCoefA());
            raiz2 = (-getCoefB() - Math.sqrt(discriminante())) / (2 * getCoefA());
            System.out.println("Las raices de la ecuacion de segundo grado son: "+ raiz1 + " y  " + raiz2);
        } else if (discriminante() == 0) {
            raiz = -getCoefB() / (2 * getCoefA());
            System.out.println("La raiz de la ecuacion de segundo grado es: " + raiz);
        } else {
            raiz = null;
            System.out.println("La ecuacion de segundo grado no tiene raices reales ");
        }
        return 0.0;
    }    
}
