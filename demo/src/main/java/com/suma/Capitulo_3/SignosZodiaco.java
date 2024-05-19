package com.suma.Capitulo_3;

public class SignosZodiaco {
    private int dia;
    private int mes;
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String signosZodiaco() {
        String signo = "";
        if ((getMes() == 3 && getDia() >= 21) || (getMes() == 4 && getMes() <= 19)) {
            signo = "Aries";
        } else if ((getMes() == 4 && getDia() >= 20) || (getMes() == 5 && getDia() <= 20)) {
            signo = "Tauro";
        } else if ((getMes() == 5 && getDia() >= 21) || (getMes() == 6 && getDia() <= 20)) {
            signo = "Géminis";
        } else if ((getMes() == 6 && getDia() >= 21) || (getMes() == 7 && getDia() <= 22)) {
            signo = "Cáncer";
        } else if ((getMes() == 7 && getDia() >= 23) || (getMes() == 8 && getDia() <= 22)) {
            signo = "Leo";
        } else if ((getMes() == 8 && getDia() >= 23) || (getMes() == 9 && getDia() <= 22)) {
            signo = "Virgo";
        } else if ((getMes() == 9 && getDia() >= 23) || (getMes() == 10 && getDia() <= 22)) {
            signo = "Libra";
        } else if ((getMes() == 10 && getDia() >= 23) || (getMes() == 11 && getDia() <= 21)) {
            signo = "Escorpio";
        } else if ((getMes() == 11 && getDia() >= 22) || (getMes() == 12 && getDia() <= 21)) {
            signo = "Sagitario";
        } else if ((getMes() == 12 && getDia() >= 22) || (getMes() == 1 && getDia() <= 19)) {
            signo = "Capricornio";
        } else if ((getMes() == 1 && getDia() >= 20) || (getMes() == 2 && getDia() <= 18)) {
            signo = "Acuario";
        } else if ((getMes() == 2 && getDia() >= 19) || (getMes() == 3 && getDia() <= 20)) {
            signo = "Piscis";
        }
        System.out.println("Tu signo zodiacal es: " + signo);
        return signo;
    }
}