/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lorenzo.letradni;

/**
 *
 * @author lollo
 */
public class LetraDni {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public class LetraDNI {
    public static char AdivinarNumeroDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }
    public static boolean ComprobarDNI(String dniCompleto) {
    if (dniCompleto.length() != 9) return false;

    int numero = Integer.parseInt(dniCompleto.substring(0, 8));
    char letra = dniCompleto.charAt(8);

    return AdivinarNumeroDNI(numero) == letra;
}
    
    public static void main(String[] args) {
        int numeroDNI = 12345678;
        System.out.println("La letra del DNI es: " + AdivinarNumeroDNI(numeroDNI));
    }
}
}
