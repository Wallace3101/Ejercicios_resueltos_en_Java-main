package com.suma.Capitulo_6;

public class SumaSerieTaylor {
    private int numTerminos;
    private Double valorParaEvaluarSerie;    
  
    public int getNumTerminos() {
        return numTerminos;
    }
    public void setNumTerminos(int numTerminos) {
        this.numTerminos = numTerminos;
    }

    public Double getValorParaEvaluarSerie() {
        return valorParaEvaluarSerie;
    }
    public void setValorParaEvaluarSerie(Double valorParaEvaluarSerie) {
        this.valorParaEvaluarSerie = valorParaEvaluarSerie;
    }

    public Double mostrarSerie() {
        Double  terminoActual=1.0;
        for (int i = 1; i <= getNumTerminos() ; i++) {
            System.out.print(terminoActual + " | ");
            terminoActual = terminoActual*getValorParaEvaluarSerie()/i;
        } 
        return 0.0;
    }

    public Double calcularSumaSerie() {
        Double  terminoActual=1.0, suma=1.0;
        for (int i = 1; i <= getNumTerminos() ; i++) {
            terminoActual = terminoActual*getValorParaEvaluarSerie()/i;
            suma = suma + terminoActual;
        }
        System.out.println("La suma es " + suma);
        return 0.0;
    }

}
