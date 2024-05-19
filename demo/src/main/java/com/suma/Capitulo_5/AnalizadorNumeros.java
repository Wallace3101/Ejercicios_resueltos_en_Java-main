package com.suma.Capitulo_5;
import java.util.List;

public class AnalizadorNumeros {
    private List<Integer> numeros;

    public List<Integer> getNumeros() {
        return numeros;
    }
    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void clasificarNumAnalisados() {
        int pares = 0, impares = 0, positivos = 0, negativos = 0;
        for (int numero : getNumeros()) {
            if (numero % 2 == 0) pares++;
            if (numero < 0) negativos++;
        }

        impares = getNumeros().size() - pares;
        positivos = getNumeros().size() - negativos;

        System.out.println("Total de numeros ingresados: " + getNumeros().size());
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}