package com.suma.Capitulo_6;
import java.util.Scanner;

public class VelocidadPromedioTrayectoria {
    private int cantidadTrayectos;

    public int getCantidadTrayectos() {
        return cantidadTrayectos;
    }
    public void setCantidadTrayectos(int cantidadTrayectos) {
        this.cantidadTrayectos = cantidadTrayectos;
    }

    float distancia, tiempo, distanciaTotal=0, tiempoTotal=0;
    Scanner scanner = new Scanner(System.in);

    public Double hallarVelocidadMedia() {
        Double distanciaTotal = 0.0, tiempoTotal = 0.0, distancia, tiempo;
        for (int i = 1; i <= cantidadTrayectos; i++) {
            System.out.println("               TRAMO N° " + i + ": ");
            System.out.println("Distancia (en metros): ");
            distancia = scanner.nextDouble();
            System.out.println("Tiempo (en segundos): ");
            tiempo = scanner.nextDouble();
            distanciaTotal = distanciaTotal + distancia;
            tiempoTotal = tiempoTotal + tiempo;
            System.out.println("");
        }
        System.out.println("Velocidad media del trayecto: " + distanciaTotal/tiempoTotal + "m/s");
        return 0.0;
    }

}
