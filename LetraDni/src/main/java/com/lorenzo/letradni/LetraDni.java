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
    
    public static void main(String[] args) {
        int numeroDNI = 12345678;
        System.out.println("La letra del DNI es: " + AdivinarNumeroDNI(numeroDNI));
    }
}
}
