package com.suma.Capitulo_1;

public class CelsiusFarenheitKelvin {
    private Double celcius;

    public Double getCelcius() {
        return celcius;
    }

    public void setCelcius(Double celcius) {
        this.celcius = celcius;
    }

    public Double convertirFarenheit() {
        Double farenheit;
        farenheit = (9 * getCelcius()/5) + 32;
        System.out.println(getCelcius()+"° Celcuis convertido a grados Farenheit es: " + farenheit + "° F");
        return 0.0;
    }

    public Double convertirKelvin() {
        Double kelvin;
        kelvin = getCelcius() + 273.15;
        System.out.println(getCelcius()+"° Celcuis convertido a grados Kelvin es: " + kelvin + "° K");
        return 0.0;
    }
}