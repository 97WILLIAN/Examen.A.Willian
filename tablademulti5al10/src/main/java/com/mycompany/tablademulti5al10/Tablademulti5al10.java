/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablademulti5al10;

/**
 *
 * @author Usuario
 */
public class Tablademulti5al10 {

    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Separador entre tablas
        }
    }
}