package com.suma.Capitulo_1;

public class SumaCubosNaturales {
    private int cantidadNumeros;
    private int sumaCubo;

    public int getCantidadNumeros() {
        return cantidadNumeros;
    }

    public void setCantidadNumeros(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
    }
    
    public SumaCubosNaturales() {
        sumaCubo = 0;
    }
    public int sumarNumerosCubo() {
        int numero;        
        for (numero = 1; numero <= getCantidadNumeros(); numero++) {
            sumaCubo += Math.pow(numero, 3);
        }
        return  sumaCubo;
    }    

    public int mostrarSumaCubo() {
        System.out.println("La suma de los " + getCantidadNumeros() + " primeros numeros naturales elevados al cubo es: " + sumaCubo);
        return  0;
    }
}
