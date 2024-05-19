package com.suma.Capitulo_6;

public class TablaMultiplicacion {
    private int numeroMultiplicar;
    public int getNumeroMultiplicar() {
        return numeroMultiplicar;
    }

    public void setNumeroMultiplicar(int numeroMultiplicar) {
        this.numeroMultiplicar = numeroMultiplicar;
    }

    public int hallarTablaNumero() {
        System.out.println("Tabla de multiplicar del " + getNumeroMultiplicar() + ":");
        for (int i = 1; i <= 15; i++)
            System.out.println(getNumeroMultiplicar() + " x " + i + " = " + getNumeroMultiplicar()*i);
        return 0;
    }

    
    
}
