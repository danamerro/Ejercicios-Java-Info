package com.nivel1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner scan = new Scanner(System.in);
        int numero1=scan.nextInt();
        System.out.println("Ingrese un numero");
        int numero2=scan.nextInt();
        int resultado= numero1*numero2;
        System.out.println(numero1+"x"+numero2+"="+resultado);

    }
}
