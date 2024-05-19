package com.suma.Capitulo_3;

public class CantidadDiasMes {
    private int mes;
    private int año;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String calcularDias() {
        String dias = "";
        switch (getMes()) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                dias = "El mes tiene 31 dias.";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                dias = "El mes tiene 30 dias.";
                break;
            case 2: 
                if ((getAño() % 4 == 0 && getAño() % 100 != 0) || (getAño() % 400 == 0))
                    dias = "El mes tiene 29 dias. ";
                else
                dias = "El mes tiene 28 dias. ";
                break;
            default: System.out.println("El mes no existe. ");
                break;
        }
        return dias;
    }

}
