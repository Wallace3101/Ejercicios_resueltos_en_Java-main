package com.suma.Capitulo_1;

public class SumaNumerosNaturales {
    private int cantidad;
    private int sumaNaturales;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public SumaNumerosNaturales() {
        sumaNaturales = 0;
    }
    public int sumarNumeros() {
        int numero;        
        for (numero = 1; numero <= getCantidad(); numero++) {
            sumaNaturales += numero;
        }
        return  sumaNaturales;
    }

    public int mostrarSuma() {
        System.out.println("La suma de los " + getCantidad() + " primeros numeros naturales es: " + sumaNaturales);
        return  0;
    }
 
}
