package com.suma.Capitulo_2;

public class EcuacionPrimerGrado {
    private Double coefLineal;
    private Double coefIndependiente;

    public Double getCoefLineal() {
            return coefLineal;
    }

    public void setCoefLineal(Double coefLineal) {
        this.coefLineal = coefLineal;
    }

    public Double getCoefIndependiente() {
        return coefIndependiente;
    }

    public void setCoefIndependiente(Double coefIndependiente) {
        this.coefIndependiente = coefIndependiente;
    }

    public Double hallarRaiz() {
        Double varPrincipal = 0.0;
        if (getCoefLineal() == 0) {
            System.out.println("No es una ecuacion de primer grado ");
        } else {
            varPrincipal = (-getCoefIndependiente())/getCoefLineal();
            System.out.println("La raiz de la ecuacion de primer grado es: " + varPrincipal);
        }
        return 0.0;
    }

}
