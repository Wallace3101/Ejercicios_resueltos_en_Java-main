package com.suma.Capitulo_4;

public class FactorizarNumero {
    private int numero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int factorizarNum() {
        int auxiliar = 2;
        System.out.println("La factorizacion del numero es: ");
        while (auxiliar <= getNumero()) {
            if (getNumero() % auxiliar == 0) {
                numero = numero / auxiliar;
                System.out.print(auxiliar + "   ");
            } else auxiliar = auxiliar + 1;
        }
        return 0;
    }


    

}
