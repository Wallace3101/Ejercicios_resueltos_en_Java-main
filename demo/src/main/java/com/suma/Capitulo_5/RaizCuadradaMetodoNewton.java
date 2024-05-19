package com.suma.Capitulo_5;
// Para hallar la raiz cuadrada de una numero
public class RaizCuadradaMetodoNewton { 
    private Double area;
    private Double tolerancia;
    private Double lado0;
    
    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }

    public Double getTolerancia() {
        return tolerancia;
    }
    public void setTolerancia(Double tolerancia) {
        this.tolerancia = tolerancia;
    }

    public Double getLado0() {
        return lado0;
    }
    public void setLado0(Double lado0) {
        this.lado0 = lado0;
    }

    public void hallarRaizCuadrada() {
        Double lado1;
        do {
            lado1 = getArea()/lado0;
            lado0 = (lado0 + lado1)/2;
        } while (Math.abs(lado1-getLado0())> getTolerancia());
            System.out.println("El lado es: " + lado0);
            System.out.println("Su cuadrado es: " + Math.pow(lado0,2));
    }
        
}
