package com.nivel1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner scan = new Scanner(System.in);
        int numeroIngresado= scan.nextInt();
        int factorial=1;
        for( int x=2;x<=numeroIngresado;x++){
            factorial= factorial*x;
        }
        System.out.println("El factorial del numero "+numeroIngresado+" es "+factorial);

    }
}
