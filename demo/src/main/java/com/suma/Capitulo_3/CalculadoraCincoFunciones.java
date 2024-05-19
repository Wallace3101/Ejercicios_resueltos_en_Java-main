package com.suma.Capitulo_3;
import java.util.Scanner;

public class CalculadoraCincoFunciones {
    Scanner scanner = new Scanner(System.in);
    private Double num1;
    private Double num2;

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public String resolverFuncion() {
            Double resultado; 
            int opcion;
            do {
                // Mostrar el menú
                System.out.println("|------------ Menú: ------------|");
                System.out.println("| 1. Sumar ---------------------|");
                System.out.println("| 2. Restar --------------------|");
                System.out.println("| 3. Multiplicar ---------------|");
                System.out.println("| 4. Dividir -------------------|");
                System.out.println("| 5. Salir ---------------------|");
                System.out.println("|-------------------------------|");
                System.out.println("Seleccione una opción:");
                // Leer la opción del usuario
                opcion = scanner.nextInt();
    
                // Manejar la opción seleccionada
                switch (opcion) {
                    case 1:
                        resultado = getNum1() + getNum2();
                        System.out.println("La suma de los operandos es " + resultado);
                        System.out.println("");
                        break;
                    case 2:
                        resultado = getNum1() - getNum2();
                        System.out.println("La resta de los operandos es " + resultado);
                        System.out.println("");
                        break;
                    case 3:
                        resultado = getNum1() * getNum2();
                        System.out.println("La multiplicacion de los operandos es " + resultado);
                        System.out.println("");
                        break;
                    case 4:                    
                        resultado = getNum1() / getNum2();
                        System.out.println("La multiplicacion de los operandos es " + resultado);
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        System.out.println("");
                }
    
            } while(opcion != 5);
            return "";
        }

}
