package com.suma.Capitulo_6;
import java.util.Scanner;

public class PromedioNumeros {
    Scanner scanner = new Scanner(System.in);
    private int numeroDatos;
    public int getNumeroDatos() {
        return numeroDatos;
    }

    public void setNumeroDatos(int numeroDatos) {
        this.numeroDatos = numeroDatos;
    }

    public Double hallarPromedio() {
        float numero, suma=0;
        for (int i = 1; i <= getNumeroDatos(); i++) {
            System.out.println("Ingrese el numero: ");
            numero = scanner.nextInt();
            suma = suma + numero;
        }

        System.out.println("El promedio de los numeros ingresados es: " + suma/getNumeroDatos());
        return 0.0;
    }

}
