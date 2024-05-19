package com.suma.Capitulo_5;

public class CalculadoraVolumenCajaLamina {
    private Double largo;
    private Double ancho;
    private Double intervaloCalculo;

    public Double getLargo() {
        return largo;
    }
    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getIntervaloCalculo() {
        return intervaloCalculo;
    }
    public void setIntervaloCalculo(Double intervaloCalculo) {
        this.intervaloCalculo = intervaloCalculo;
    }

    public void hallarMaximoVolumen() {
        Double volumen, volumenMax = 0.0, auxiliarVol = 0.0, auxiliarVolMax = 0.0, altura;
        do {
            auxiliarVol = auxiliarVol + getIntervaloCalculo();
            volumen = (getLargo() - (2 * auxiliarVol)) * (getAncho() - (2 * auxiliarVol)) * auxiliarVol;
            if (volumen > volumenMax) { 
                volumenMax = volumen; 
                auxiliarVolMax =auxiliarVol; 
            }
        } while (auxiliarVol <= ((getAncho() / 2) - getIntervaloCalculo()));
        altura = auxiliarVolMax;
        System.out.println("Volumen maximo: " + volumenMax);
        System.out.println("Largo: " + (getLargo() - 2*auxiliarVolMax));
        System.out.println("Ancho: " + (getAncho() - 2*auxiliarVolMax));
        System.out.println("Altura: " + altura);
        
    }

}
