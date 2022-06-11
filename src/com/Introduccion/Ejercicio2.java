package com.Introduccion;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        double factorial=1;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double numero = scan.nextDouble();

        while (numero != 0) {
        factorial=factorial*numero;
        numero--;
        }
        System.out.println(factorial);
    }
}