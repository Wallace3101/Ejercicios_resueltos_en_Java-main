package com.suma.Capitulo_5;

public class MaximaAreaTerreno {
    private Double anchoFijo;
    private Double incremento;

    public Double getAnchoFijo() {
        return anchoFijo;
    }
    public void setAnchoFijo(Double anchoFijo) {
        this.anchoFijo = anchoFijo;
    }

    public Double getIncremento() {
        return incremento;
    }
    public void setIncremento(Double incremento) {
        this.incremento = incremento;
    }

    public Double hallarAreaMaxima() {
        Double dimensionTerreno = 0.0, dimensionTerrenoMax = 0.0, area, areamax = 0.0;
        do {
            dimensionTerreno = dimensionTerreno + getIncremento();
            area = dimensionTerreno * (getAnchoFijo() - (2*dimensionTerreno));
            if (area > areamax) {
                areamax = area;
                dimensionTerrenoMax = dimensionTerreno;
            }
        } while (dimensionTerreno <= getAnchoFijo() - getIncremento());

        System.out.println("Area maxima: " + areamax);
        System.out.println("Dimensiones: " + dimensionTerrenoMax + " x " + (getAnchoFijo() - dimensionTerrenoMax));
        return 0.0;
    }    
    
}
