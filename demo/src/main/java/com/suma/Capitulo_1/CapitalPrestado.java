package com.suma.Capitulo_1;

public class CapitalPrestado {
    private Double tazaInteres;
    private Double capital;
    private int año;

    public Double getTazaInteres() {
        return tazaInteres;
    }
    public void setTazaInteres(Double tazaInteres) {
        this.tazaInteres = tazaInteres;
    }
    public Double getCapital() {
        return capital;
    }
    public void setCapital(Double capital) {
        this.capital = capital;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public Double calcularInteres(){
        Double interes;
        interes = getCapital() * (getTazaInteres()/100) * getAño();
        System.out.println("El interes a devolver es de S/." + interes);
        return 0.0;
    }
    


}
